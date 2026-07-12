/*
Question Link:
https://www.geeksforgeeks.org/problems/floor-in-bst/1

Question:
Find the floor of a given key
in a Binary Search Tree.

Floor = Largest value <= key.
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
        Floor = Largest value <= key.

        Whenever a smaller value is found,
        store it and move right to search
        for a larger valid candidate.
    */
    public int findMaxFork(Node root, int key) {

        int floor = -1;

        while(root != null){

            if(root.data == key){
                return root.data;
            }

            if(root.data < key){
                floor = root.data;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }

        return floor;
    }
}