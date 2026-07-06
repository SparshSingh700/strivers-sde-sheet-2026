/*
Question Link:
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

Question:
Find the Lowest Common Ancestor (LCA)
of two given nodes in a Binary Tree.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 * }
 */

class Solution {

    /*
        If current node is p or q,
        return it.

        If p and q are found in different
        subtrees, current node is the LCA.
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null){
            return root;
        }

        return left != null ? left : right;
    }
}