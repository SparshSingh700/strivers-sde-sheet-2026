/*
Question Link:
https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/

Question:
Convert a sorted array
into a Height Balanced BST.
*/

/**
 * Definition for a binary tree node.
 */

class Solution {

    /*
        Pick the middle element
        as the root.

        Left half forms
        the left subtree.

        Right half forms
        the right subtree.
    */
    public TreeNode sortedArrayToBST(int[] nums) {

        return build(nums, 0, nums.length - 1);
    }

    TreeNode build(int[] nums, int left, int right){

        if(left > right){
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode root = new TreeNode(nums[mid]);

        root.left = build(nums, left, mid - 1);

        root.right = build(nums, mid + 1, right);

        return root;
    }
}