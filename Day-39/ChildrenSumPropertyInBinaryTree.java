/*
Question Link:
https://www.geeksforgeeks.org/problems/children-sum-parent/1

Question:
Check whether every non-leaf node
satisfies the Children Sum Property.
*/

/*
class Node{
    int data;
    Node left, right;
}
*/

class Solution {

    /*
        Every non-leaf node must satisfy:

        Node =
        Left Child + Right Child

        Leaf nodes are always valid.
    */
    public static boolean isSumProperty(Node root){

        if(root == null){
            return true;
        }

        if(root.left == null && root.right == null){
            return true;
        }

        int left = 0;
        int right = 0;

        if(root.left != null){
            left = root.left.data;
        }

        if(root.right != null){
            right = root.right.data;
        }

        return root.data == left + right
            && isSumProperty(root.left)
            && isSumProperty(root.right);
    }
}