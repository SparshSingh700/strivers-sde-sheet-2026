/*
Question Link:
https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1

Question:
Return all Root to Leaf
paths in a Binary Tree.
*/

/*
Definition for Node

class Node{
    int data;
    Node left;
    Node right;
}
*/

class Solution {

    /*
        Traverse from root to leaf.

        Carry the current path.

        When a leaf is reached,
        store the path and backtrack.
    */
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        dfs(root, new ArrayList<>(), ans);

        return ans;
    }

    static void dfs(Node node, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ans) {

        if(node == null) {
            return;
        }

        path.add(node.data);

        if(node.left == null && node.right == null) {
            ans.add(new ArrayList<>(path));
        }

        dfs(node.left, path, ans);
        dfs(node.right, path, ans);

        path.remove(path.size() - 1);
    }
}