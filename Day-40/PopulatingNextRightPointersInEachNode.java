/*
Question Link:
https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

Question:
Populate each next pointer
to point to its next right node
in a Perfect Binary Tree.
*/

/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;
}
*/

class Solution {

    /*
        Since the tree is perfect,

        1. Connect left child to right child.
        2. Connect right child to the next node's left child.
    */
    public Node connect(Node root) {

        if(root == null){
            return null;
        }

        // Leftmost node of current level.
        Node leftMost = root;

        // Last level contains only leaves.
        while(leftMost.left != null){

            Node curr = leftMost;

            while(curr != null){

                // Connect siblings.
                curr.left.next = curr.right;

                // Connect cousins.
                if(curr.next != null){
                    curr.right.next = curr.next.left;
                }

                curr = curr.next;
            }

            leftMost = leftMost.left;
        }

        return root;
    }
}