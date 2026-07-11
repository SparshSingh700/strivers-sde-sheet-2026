/*
Question Link:
https://www.geeksforgeeks.org/problems/predecessor-and-successor/1

Question:
Find the inorder predecessor
and successor of a given key
in a BST.
*/

/*
class Node {
    int data;
    Node left, right;
}
*/

class Solution {

    /*
        Predecessor:
        Largest value smaller than key.

        Successor:
        Smallest value greater than key.

        Use BST property to search
        without traversing the whole tree.
    */
    public ArrayList<Node> findPreSuc(Node root, int key) {

        Node predecessor = null;
        Node successor = null;

        Node curr = root;

        // Find predecessor.
        while(curr != null){

            if(curr.data < key){
                predecessor = curr;
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }

        curr = root;

        // Find successor.
        while(curr != null){

            if(curr.data > key){
                successor = curr;
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }

        ArrayList<Node> ans = new ArrayList<>();

        ans.add(predecessor);
        ans.add(successor);

        return ans;
    }
}