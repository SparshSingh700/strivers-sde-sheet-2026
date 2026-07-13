/*
Question Link:
https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/

Question:
Find the maximum possible sum
of any subtree that is also
a Binary Search Tree.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    int maxSum = 0;

    class NodeValue {

        int minNode;
        int maxNode;
        int sum;

        NodeValue(int minNode, int maxNode, int sum){
            this.minNode = minNode;
            this.maxNode = maxNode;
            this.sum = sum;
        }
    }

    /*
        Every subtree returns:

        minNode -> minimum value
        maxNode -> maximum value
        sum -> sum of the BST subtree

        If current subtree is a BST,
        update the global maximum sum.
    */
    public int maxSumBST(TreeNode root) {

        helper(root);

        return maxSum;
    }

    NodeValue helper(TreeNode node){

        // Empty tree is a valid BST.
        if(node == null){
            return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
        }

        NodeValue left = helper(node.left);
        NodeValue right = helper(node.right);

        // Current subtree satisfies BST property.
        if(left.maxNode < node.val && node.val < right.minNode){

            int currSum = left.sum + right.sum + node.val;

            maxSum = Math.max(maxSum, currSum);

            return new NodeValue(
                Math.min(node.val, left.minNode),
                Math.max(node.val, right.maxNode),
                currSum
            );
        }

        /*
            Invalid BST.

            Return an invalid range so
            the parent also becomes invalid.
        */
        return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
    }
}