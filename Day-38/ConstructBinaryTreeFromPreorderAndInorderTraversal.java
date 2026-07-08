/*
Question Link:
https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

Question:
Construct a Binary Tree
from its Inorder
and Postorder Traversals.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    int postIndex;

    /*
        Postorder always gives
        the current root.

        Since postorder is processed
        from the end,

        build Right subtree first,
        then Left subtree.
    */
    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }

        return build(postorder, 0, inorder.length - 1, map);
    }

    TreeNode build(int[] postorder, int left, int right, HashMap<Integer, Integer> map){

        if(left > right){
            return null;
        }

        TreeNode root = new TreeNode(postorder[postIndex--]);

        int inorderIndex = map.get(root.val);

        root.right = build(postorder, inorderIndex + 1, right, map);

        root.left = build(postorder, left, inorderIndex - 1, map);

        return root;
    }
}