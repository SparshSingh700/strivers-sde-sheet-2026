/*
Question Link:
https://leetcode.com/problems/search-in-a-binary-search-tree/

Question:
Search for a value
in a Binary Search Tree
and return its subtree.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    /*
        Use the BST property.

        Smaller values lie on the left.

        Larger values lie on the right.
    */
    public TreeNode searchBST(TreeNode root, int val) {

        while(root != null){

            if(root.val == val){
                return root;
            }

            if(val < root.val){
                root = root.left;
            }
            else{
                root = root.right;
            }
        }

        return null;
    }
}