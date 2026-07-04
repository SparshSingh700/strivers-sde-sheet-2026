/*
Question Link:
https://leetcode.com/problems/binary-tree-right-side-view/

Question:
Return the nodes visible
from the right side of
the binary tree.
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

    /*
        Traverse in Root-Right-Left order.

        The first node visited at every level
        is the visible node.
    */
    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> ans = new ArrayList<>();

        dfs(root, 0, ans);

        return ans;
    }

    void dfs(TreeNode node, int level, List<Integer> ans){

        if(node == null){
            return;
        }

        if(ans.size() == level){
            ans.add(node.val);
        }

        dfs(node.right, level + 1, ans);
        dfs(node.left, level + 1, ans);
    }
}