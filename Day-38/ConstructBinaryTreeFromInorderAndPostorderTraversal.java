/*
Question Link:
https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

Question:
Construct a Binary Tree
from its Preorder
and Inorder Traversals.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    int preIndex = 0;

    /*
        Preorder always gives
        the current root.

        Inorder splits the tree into
        left and right subtrees.
    */
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return build(preorder, 0, inorder.length - 1, map);
    }

    TreeNode build(int[] preorder, int left, int right, HashMap<Integer, Integer> map){

        if(left > right){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);

        int inorderIndex = map.get(root.val);

        root.left = build(preorder, left, inorderIndex - 1, map);

        root.right = build(preorder, inorderIndex + 1, right, map);

        return root;
    }
}