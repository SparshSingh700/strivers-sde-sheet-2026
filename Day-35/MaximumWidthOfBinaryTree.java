/*
Question Link:
https://leetcode.com/problems/maximum-width-of-binary-tree/

Question:
Return the Maximum Width
of a Binary Tree.
*/

/**
 * Definition for a binary tree node.
 */

class Pair {

    TreeNode node;
    int index;

    Pair(TreeNode node, int index) {
        this.node = node;
        this.index = index;
    }
}

class Solution {

    /*
        Perform Level Order Traversal.

        Give every node an index
        as if the tree were complete.

        Width =
        Last Index - First Index + 1
    */
    public int widthOfBinaryTree(TreeNode root) {

        int maxWidth = 0;

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root, 0));

        while(!q.isEmpty()) {

            int size = q.size();

            int minIndex = q.peek().index;

            int first = 0;
            int last = 0;

            for(int i = 0; i < size; i++) {

                Pair cur = q.poll();

                TreeNode node = cur.node;

                int index = cur.index - minIndex;

                if(i == 0) {
                    first = index;
                }

                if(i == size - 1) {
                    last = index;
                }

                if(node.left != null) {
                    q.offer(new Pair(node.left, 2 * index + 1));
                }

                if(node.right != null) {
                    q.offer(new Pair(node.right, 2 * index + 2));
                }
            }

            maxWidth = Math.max(maxWidth, last - first + 1);
        }

        return maxWidth;
    }
}