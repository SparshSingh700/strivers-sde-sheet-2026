/*
Question Link:
https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

Question:
Return the Boundary Traversal
of a Binary Tree.
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
        Boundary Traversal =

        Root

        + Left Boundary
        (excluding leaves)

        + All Leaf Nodes

        + Right Boundary
        in reverse
        (excluding leaves)
    */
    ArrayList<Integer> boundaryTraversal(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if(root == null){
            return ans;
        }

        if(!isLeaf(root)){
            ans.add(root.data);
        }

        addLeftBoundary(root, ans);

        addLeaves(root, ans);

        addRightBoundary(root, ans);

        return ans;
    }

    boolean isLeaf(Node node){
        return node.left == null && node.right == null;
    }

    void addLeftBoundary(Node root, ArrayList<Integer> ans){

        Node curr = root.left;

        while(curr != null){

            if(!isLeaf(curr)){
                ans.add(curr.data);
            }

            if(curr.left != null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }

    void addLeaves(Node root, ArrayList<Integer> ans){

        if(root == null){
            return;
        }

        if(isLeaf(root)){
            ans.add(root.data);
            return;
        }

        addLeaves(root.left, ans);
        addLeaves(root.right, ans);
    }

    void addRightBoundary(Node root, ArrayList<Integer> ans){

        Node curr = root.right;

        ArrayList<Integer> temp = new ArrayList<>();

        while(curr != null){

            if(!isLeaf(curr)){
                temp.add(curr.data);
            }

            if(curr.right != null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }

        for(int i = temp.size() - 1; i >= 0; i--){
            ans.add(temp.get(i));
        }
    }
}