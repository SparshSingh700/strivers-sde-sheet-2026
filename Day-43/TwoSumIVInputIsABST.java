/*
Question Link:
https://leetcode.com/problems/two-sum-iv-input-is-a-bst/

Question:
Given a BST and a target,
return true if there exist two
different nodes whose sum equals target.
*/

/**
 * Definition for a binary tree node.
 */

class BSTIterator {

    Stack<TreeNode> stack = new Stack<>();
    boolean reverse;

    BSTIterator(TreeNode root, boolean reverse) {
        this.reverse = reverse;
        pushAll(root);
    }

    // Push left boundary (normal)
    // or right boundary (reverse).
    void pushAll(TreeNode node) {

        while(node != null){
            stack.push(node);

            if(reverse){
                node = node.right;
            }
            else{
                node = node.left;
            }
        }
    }

    // Next smallest / next largest.
    int next() {

        TreeNode node = stack.pop();

        if(reverse){
            pushAll(node.left);
        }
        else{
            pushAll(node.right);
        }

        return node.val;
    }
}

class Solution {

    /*
        Use two BST iterators.

        One gives the next smallest value.
        One gives the next largest value.

        Apply the two-pointer technique.
    */
    public boolean findTarget(TreeNode root, int k) {

        if(root == null){
            return false;
        }

        BSTIterator left = new BSTIterator(root, false);
        BSTIterator right = new BSTIterator(root, true);

        int i = left.next();
        int j = right.next();

        while(i < j){

            int sum = i + j;

            if(sum == k){
                return true;
            }

            if(sum < k){
                i = left.next();
            }
            else{
                j = right.next();
            }
        }

        return false;
    }
}