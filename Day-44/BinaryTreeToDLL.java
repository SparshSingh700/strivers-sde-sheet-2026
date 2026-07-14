/*
Question Link:
https://www.geeksforgeeks.org/problems/binary-tree-to-dll/1

Question:
Convert a Binary Tree
to a Doubly Linked List
using inorder traversal.
*/

/*
Structure for tree and linked list

class Node {
    public int data;
    public Node left, right;

    public Node(int x) {
        data = x;
        left = right = null;
    }
}
*/

class Solution {

    Node prev = null;
    Node head = null;

    /*
        Inorder traversal visits nodes
        in sorted order for a BST
        (or inorder order for any Binary Tree).

        Connect each node with
        the previously visited node.
    */
    public Node treeToDLL(Node root) {

        inorder(root);

        return head;
    }

    void inorder(Node node) {

        if(node == null){
            return;
        }

        inorder(node.left);

        // First node becomes DLL head.
        if(prev == null){
            head = node;
        }
        else{
            prev.right = node;
            node.left = prev;
        }

        prev = node;

        inorder(node.right);
    }
}