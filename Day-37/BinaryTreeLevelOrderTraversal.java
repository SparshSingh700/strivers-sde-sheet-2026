/*
Question Link:
https://leetcode.com/problems/binary-tree-level-order-traversal/

Question:
Return the Level Order Traversal
of a Binary Tree.
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
        Perform Breadth First Search.

        Process one level at a time
        using the current queue size.
    */
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        q.offer(root);

        while(!q.isEmpty()){

            int size = q.size();

            List<Integer> level = new ArrayList<>();

            for(int i = 0; i < size; i++){

                TreeNode node = q.poll();

                level.add(node.val);

                if(node.left != null){
                    q.offer(node.left);
                }

                if(node.right != null){
                    q.offer(node.right);
                }
            }

            ans.add(level);
        }

        return ans;
    }
}