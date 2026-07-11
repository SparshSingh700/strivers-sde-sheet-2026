/*
Question Link:
https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/

Question:
Construct a Binary Search Tree
from its preorder traversal.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    int index = 0;

    /*
        Preorder always gives the next root.

        Use an upper bound to decide
        whether the current value
        belongs to the current subtree.
    */
    public TreeNode bstFromPreorder(int[] preorder) {

        return build(preorder, Integer.MAX_VALUE);
    }

    TreeNode build(int[] preorder, int upperBound) {

        if(index == preorder.length || preorder[index] > upperBound){
            return null;
        }

        TreeNode root = new TreeNode(preorder[index++]);

        // Values smaller than root go left.
        root.left = build(preorder, root.val);

        // Remaining valid values go right.
        root.right = build(preorder, upperBound);

        return root;
    }
}