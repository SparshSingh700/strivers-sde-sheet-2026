/*
Question Link:
https://leetcode.com/problems/binary-tree-maximum-path-sum/

Question:
Find the maximum path sum
of a Binary Tree.
*/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 * }
 */

class Solution {

    // Stores the maximum path sum found so far.
    int maxi = Integer.MIN_VALUE;

    /*
        Maximum path through a node =

        Left Gain
        + Current Node
        + Right Gain

        Return only one side because
        a path cannot split while
        moving towards the parent.
    */
    public int maxPathSum(TreeNode root) {

        maxGain(root);

        return maxi;
    }

    int maxGain(TreeNode node) {

        if(node == null){
            return 0;
        }

        // Ignore negative paths.
        int left = Math.max(0, maxGain(node.left));

        int right = Math.max(0, maxGain(node.right));

        // Best path passing through current node.
        maxi = Math.max(maxi, left + node.val + right);

        // Return extendable gain.
        return node.val + Math.max(left, right);
    }
}