/*
Question Link:
https://leetcode.com/problems/symmetric-tree/

Question:
Check whether a Binary Tree
is symmetric around its center.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    /*
        Compare the left and right subtrees
        as mirror images.

        Outer children must match.
        Inner children must also match.
    */
    public boolean isSymmetric(TreeNode root) {

        if(root == null){
            return true;
        }

        return isMirror(root.left, root.right);
    }

    boolean isMirror(TreeNode left, TreeNode right){

        if(left == null && right == null){
            return true;
        }

        if(left == null || right == null){
            return false;
        }

        if(left.val != right.val){
            return false;
        }

        return isMirror(left.left, right.right)
            && isMirror(left.right, right.left);
    }
}