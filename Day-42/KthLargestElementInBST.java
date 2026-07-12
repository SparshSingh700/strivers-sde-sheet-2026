/*
Question Link:
https://www.geeksforgeeks.org/problems/kth-largest-element-in-bst/1

Question:
Find the kth largest element
in a Binary Search Tree.
*/

/*
Structure of a Binary Tree Node

class Node {
    public int data;
    public Node left;
    public Node right;
}
*/

class Solution {

    int count = 0;

    /*
        Reverse inorder traversal
        visits BST nodes in
        descending order.

        The kth visited node
        is the answer.
    */
    public int kthLargest(Node root, int k) {

        if(root == null){
            return -1;
        }

        int right = kthLargest(root.right, k);

        if(right != -1){
            return right;
        }

        count++;

        if(count == k){
            return root.data;
        }

        return kthLargest(root.left, k);
    }
}