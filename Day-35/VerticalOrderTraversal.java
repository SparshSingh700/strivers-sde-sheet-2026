/*
Question Link:
https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

Question:
Return the Vertical Order Traversal
of a Binary Tree.
*/

/**
 * Definition for a binary tree node.
 */

class Tuple {

    TreeNode node;
    int vertical;
    int level;

    Tuple(TreeNode node, int vertical, int level) {
        this.node = node;
        this.vertical = vertical;
        this.level = level;
    }
}

class Solution {

    /*
        Perform BFS.

        Store nodes as:

        Vertical
            ->
        Level
            ->
        Sorted Node Values

        TreeMap keeps verticals and levels sorted.

        PriorityQueue sorts nodes
        lying on the same position.
    */
    public List<List<Integer>> verticalTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();

        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

        Queue<Tuple> q = new LinkedList<>();

        q.offer(new Tuple(root, 0, 0));

        while(!q.isEmpty()) {

            Tuple cur = q.poll();

            TreeNode node = cur.node;
            int vertical = cur.vertical;
            int level = cur.level;

            map.putIfAbsent(vertical, new TreeMap<>());

            map.get(vertical).putIfAbsent(level, new PriorityQueue<>());

            map.get(vertical).get(level).offer(node.val);

            if(node.left != null) {
                q.offer(new Tuple(node.left, vertical - 1, level + 1));
            }

            if(node.right != null) {
                q.offer(new Tuple(node.right, vertical + 1, level + 1));
            }
        }

        for(TreeMap<Integer, PriorityQueue<Integer>> levels : map.values()) {

            List<Integer> list = new ArrayList<>();

            for(PriorityQueue<Integer> pq : levels.values()) {

                while(!pq.isEmpty()) {
                    list.add(pq.poll());
                }
            }

            ans.add(list);
        }

        return ans;
    }
}