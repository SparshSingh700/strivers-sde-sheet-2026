/*
Question Link:
https://leetcode.com/problems/same-tree/

Question:
Check whether two
Binary Trees are identical.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    /*
        Trees are identical if:

        - Both nodes are null.
        - Values match.
        - Left subtrees match.
        - Right subtrees match.
    */
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null){
            return true;
        }

        if(p == null || q == null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        return isSameTree(p.left, q.left)
            && isSameTree(p.right, q.right);
    }
}