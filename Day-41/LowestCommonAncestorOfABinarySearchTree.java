/*
Question Link:
https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/

Question:
Find the Lowest Common Ancestor
of two nodes in a BST.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    /*
        Use the BST property.

        If both nodes are smaller,
        move left.

        If both nodes are larger,
        move right.

        Otherwise,
        current node is the answer.
    */
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        while(root != null){

            if(root.val > p.val && root.val > q.val){
                root = root.left;
            }
            else if(root.val < p.val && root.val < q.val){
                root = root.right;
            }
            else{
                return root;
            }
        }

        return null;
    }
}