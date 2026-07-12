/*
Question Link:
https://www.geeksforgeeks.org/problems/implementing-ceil-in-bst/1

Question:
Find the ceil of a given key
in a Binary Search Tree.

Ceil = Smallest value >= key.
*/

/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {

    /*
        Ceil = Smallest value >= key.

        Whenever a larger value is found,
        store it and move left to search
        for a smaller valid candidate.
    */
    int findCeil(Node root, int key) {

        int ceil = -1;

        while(root != null){

            if(root.data == key){
                return root.data;
            }

            if(root.data > key){
                ceil = root.data;
                root = root.left;
            }
            else{
                root = root.right;
            }
        }

        return ceil;
    }
}