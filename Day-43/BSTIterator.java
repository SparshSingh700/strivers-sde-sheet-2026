/*
Question Link:
https://leetcode.com/problems/binary-search-tree-iterator/

Question:
Design an iterator over a Binary Search Tree (BST).

Implement next() and hasNext()
such that next() always returns
the next smallest element.
*/

/**
 * Definition for a binary tree node.
 */

class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();

    /*
        Store the entire left boundary.

        The top of the stack always
        contains the next smallest element.
    */
    public BSTIterator(TreeNode root) {
        pushAll(root);
    }

    // Push every left child.
    private void pushAll(TreeNode node) {
        while(node != null){
            stack.push(node);
            node = node.left;
        }
    }

    /*
        Remove the current smallest node.

        Then push the left boundary
        of its right subtree.
    */
    public int next() {

        TreeNode node = stack.pop();

        pushAll(node.right);

        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}