/*
Question Link:
https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

Question:
Flatten a Binary Tree
into a Linked List
following preorder traversal.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    TreeNode prev = null;

    /*
        Traverse in reverse preorder:

        Right -> Left -> Root

        Keep attaching the previously
        processed node.
    */
    public void flatten(TreeNode root){

        if(root == null){
            return;
        }

        flatten(root.right);

        flatten(root.left);

        root.right = prev;
        root.left = null;

        prev = root;
    }
}