/*
Question Link:
https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1

Question:
Return the Top View
of the Binary Tree.
*/

/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
    }
}
*/

class Pair{
    Node node;
    int hd;

    Pair(Node node, int hd){
        this.node = node;
        this.hd = hd;
    }
}

class Solution {

    /*
        Traverse level by level.

        Store the first node
        encountered for every
        horizontal distance.
    */
    public ArrayList<Integer> topView(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        TreeMap<Integer, Integer> map = new TreeMap<>();

        Queue<Pair> q = new LinkedList<>();

        q.offer(new Pair(root, 0));

        while(!q.isEmpty()){

            Pair cur = q.poll();

            Node node = cur.node;
            int hd = cur.hd;

            if(!map.containsKey(hd)){
                map.put(hd, node.data);
            }

            if(node.left != null){
                q.offer(new Pair(node.left, hd - 1));
            }

            if(node.right != null){
                q.offer(new Pair(node.right, hd + 1));
            }
        }

        for(int value : map.values()){
            ans.add(value);
        }

        return ans;
    }
}