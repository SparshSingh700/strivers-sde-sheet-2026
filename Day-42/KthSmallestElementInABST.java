/*
Question Link:
https://leetcode.com/problems/kth-smallest-element-in-a-bst/

Question:
Find the kth smallest element
in a Binary Search Tree.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    int count = 0;
    int ans = 0;

    /*
        Inorder traversal of a BST
        visits nodes in sorted order.

        The kth visited node
        is the answer.
    */
    public int kthSmallest(TreeNode root, int k) {

        inorder(root, k);

        return ans;
    }

    void inorder(TreeNode node, int k){

        if(node == null){
            return;
        }

        inorder(node.left, k);

        count++;

        if(count == k){
            ans = node.val;
            return;
        }

        inorder(node.right, k);
    }
}