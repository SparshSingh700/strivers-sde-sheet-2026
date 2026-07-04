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
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {

    /*
        Morris Preorder Traversal.

        Visit node before creating the thread.
        Uses temporary threads so traversal
        works without recursion or stack.

        Time : O(n)
        Space: O(1)
    */
    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> ans = new ArrayList<>();
        TreeNode curr = root;

        while(curr != null){

            if(curr.left == null){
                ans.add(curr.val);
                curr = curr.right;
            }
            else{

                // Find inorder predecessor.
                TreeNode prev = curr.left;

                while(prev.right != null && prev.right != curr){
                    prev = prev.right;
                }

                // Thread already exists.
                if(prev.right == curr){
                    prev.right = null;
                    curr = curr.right;
                }

                // Create thread and visit first.
                else{
                    ans.add(curr.val);
                    prev.right = curr;
                    curr = curr.left;
                }
            }
        }

        return ans;
    }

    /*
    ======================================================
            Recursive Traversal (Revision)
    ======================================================

    public List<Integer> preorderTraversal(TreeNode root){

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
    */
}