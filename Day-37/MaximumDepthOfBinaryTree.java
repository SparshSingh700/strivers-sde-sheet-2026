/*
Question Link:
https://leetcode.com/problems/maximum-depth-of-binary-tree/

Question:
Find the Maximum Depth
of a Binary Tree.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    /*
        Height of a node =

        max(left height,
            right height) + 1
    */
    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}