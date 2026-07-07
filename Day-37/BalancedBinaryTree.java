/*
Question Link:
https://leetcode.com/problems/balanced-binary-tree/

Question:
Check whether
a Binary Tree
is Height Balanced.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    /*
        Return subtree height.

        If any subtree is unbalanced,
        immediately return -1.

        Otherwise return its height.
    */
    public boolean isBalanced(TreeNode root) {

        return height(root) != -1;
    }

    int height(TreeNode node){

        if(node == null){
            return 0;
        }

        int leftHeight = height(node.left);

        if(leftHeight == -1){
            return -1;
        }

        int rightHeight = height(node.right);

        if(rightHeight == -1){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}