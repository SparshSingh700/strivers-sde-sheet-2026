/*
Question Link:
https://leetcode.com/problems/binary-tree-postorder-traversal/

Question:
Return the postorder traversal
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
        Traverse Left.

        Traverse Right.

        Visit Root.
    */
    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        postorder(root, ans);

        return ans;
    }

    void postorder(TreeNode node, List<Integer> ans){

        if(node == null){
            return;
        }

        postorder(node.left, ans);

        postorder(node.right, ans);

        ans.add(node.val);
    }
}