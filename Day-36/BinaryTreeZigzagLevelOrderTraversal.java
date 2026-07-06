/*
Question Link:
https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

Question:
Return the Zigzag
Level Order Traversal
of a Binary Tree.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    /*
        Perform BFS.

        Store every level either
        Left -> Right
        or
        Right -> Left
        depending on direction.
    */
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();

        boolean leftToRight = true;

        q.offer(root);

        while(!q.isEmpty()){

            int size = q.size();

            Integer[] level = new Integer[size];

            for(int i = 0; i < size; i++){

                TreeNode node = q.poll();

                int index = leftToRight ? i : size - i - 1;

                level[index] = node.val;

                if(node.left != null){
                    q.offer(node.left);
                }

                if(node.right != null){
                    q.offer(node.right);
                }
            }

            ans.add(Arrays.asList(level));

            leftToRight = !leftToRight;
        }

        return ans;
    }
}