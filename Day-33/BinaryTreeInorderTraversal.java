/*
Question Link:
https://leetcode.com/problems/binary-tree-inorder-traversal/

Question:
Return the inorder traversal
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
        Morris Traversal.

        Create temporary threads so that
        we can return to a node without
        recursion or stack.

        Time : O(n)
        Space: O(1)
    */
    public List<Integer> inorderTraversal(TreeNode root) {

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

                    ans.add(curr.val);

                    curr = curr.right;
                }

                // Create thread.
                else{

                    prev.right = curr;
                    curr = curr.left;
                }
            }
        }

        return ans;
    }

    /*
    =====================================================
            Recursive Traversal (Revision)
    =====================================================

    public List<Integer> inorderTraversal(TreeNode root){

        List<Integer> ans = new ArrayList<>();

        inorder(root, ans);

        return ans;
    }

    void inorder(TreeNode node, List<Integer> ans){

        if(node == null){
            return;
        }

        inorder(node.left, ans);

        ans.add(node.val);

        inorder(node.right, ans);
    }
    */
}