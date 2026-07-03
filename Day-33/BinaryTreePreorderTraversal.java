/*
Question Link:
https://leetcode.com/problems/binary-tree-preorder-traversal/

Question:
Return the preorder traversal
of a binary tree.
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
        Visit Root.

        Traverse Left.

        Traverse Right.
    */
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        preorder(root, ans);

        return ans;
    }

    void preorder(TreeNode node, List<Integer> ans){

        if(node == null){
            return;
        }

        ans.add(node.val);

        preorder(node.left, ans);

        preorder(node.right, ans);
    }
}