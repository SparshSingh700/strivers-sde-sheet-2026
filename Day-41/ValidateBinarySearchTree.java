/*
Question Link:
https://leetcode.com/problems/validate-binary-search-tree/

Question:
Check whether a Binary Tree
is a valid Binary Search Tree.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    /*
        Every node must lie within
        an allowed range.

        Left subtree:
        (lowerBound, node.val)

        Right subtree:
        (node.val, upperBound)
    */
    public boolean isValidBST(TreeNode root) {

        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    boolean validate(TreeNode node, long lowerBound, long upperBound) {

        if(node == null){
            return true;
        }

        if(node.val <= lowerBound || node.val >= upperBound){
            return false;
        }

        return validate(node.left, lowerBound, node.val)
            && validate(node.right, node.val, upperBound);
    }
}