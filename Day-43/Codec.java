/*
Question Link:
https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

Question:
Serialize a binary tree into a string
and deserialize it back into the
same binary tree.
*/

/**
 * Definition for a binary tree node.
 */

public class Codec {

    /*
        Serialize using Level Order.

        Store null nodes as "#".
    */
    public String serialize(TreeNode root) {

        if(root == null){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()){

            TreeNode node = q.remove();

            if(node == null){
                sb.append("# ");
                continue;
            }

            sb.append(node.val).append(" ");

            q.offer(node.left);
            q.offer(node.right);
        }

        return sb.toString();
    }

    /*
        Reconstruct the tree
        using Level Order.
    */
    public TreeNode deserialize(String data) {

        if(data.length() == 0){
            return null;
        }

        String[] values = data.split(" ");

        TreeNode root = new TreeNode(Integer.parseInt(values[0]));

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;

        while(!q.isEmpty()){

            TreeNode node = q.remove();

            if(!values[i].equals("#")){
                node.left = new TreeNode(Integer.parseInt(values[i]));
                q.offer(node.left);
            }

            i++;

            if(!values[i].equals("#")){
                node.right = new TreeNode(Integer.parseInt(values[i]));
                q.offer(node.right);
            }

            i++;
        }

        return root;
    }
}