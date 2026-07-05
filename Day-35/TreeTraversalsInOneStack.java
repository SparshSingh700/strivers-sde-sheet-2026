/*
Reference:
https://www.geeksforgeeks.org/preorder-postorder-and-inorder-traversal-of-a-binary-tree-using-a-single-stack/

Question:
Perform Preorder, Inorder and Postorder Traversal
using only one stack.
*/

import java.util.*;

class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }
}

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class TreeTraversalsInOneStack {

    /*
        State 1 -> Preorder
        State 2 -> Inorder
        State 3 -> Postorder

        Each node enters the stack only once.
        The state tells which traversal is pending.
    */
    static void allTraversal(Node root) {

        ArrayList<Integer> preorder = new ArrayList<>();
        ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> postorder = new ArrayList<>();

        Stack<Pair> stack = new Stack<>();

        stack.push(new Pair(root, 1));

        while(!stack.isEmpty()) {

            Pair cur = stack.peek();

            // Preorder
            if(cur.state == 1) {

                preorder.add(cur.node.data);

                cur.state++;

                if(cur.node.left != null) {
                    stack.push(new Pair(cur.node.left, 1));
                }
            }

            // Inorder
            else if(cur.state == 2) {

                inorder.add(cur.node.data);

                cur.state++;

                if(cur.node.right != null) {
                    stack.push(new Pair(cur.node.right, 1));
                }
            }

            // Postorder
            else {

                postorder.add(cur.node.data);
                stack.pop();
            }
        }

        System.out.println("Preorder : " + preorder);
        System.out.println("Inorder  : " + inorder);
        System.out.println("Postorder: " + postorder);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        allTraversal(root);
    }
}