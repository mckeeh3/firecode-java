package solutions;

import java.util.ArrayList;

/**
 * Given a binary tree, write a method to recursively traverse the tree in the preorder manner. Mark a node as
 * visited by adding its data to the list - Arraylist <Integer> preorderedList.
 */
public class Solution011RecursicePreorderTraversal {
    ArrayList<Integer> preorderedList = new ArrayList<Integer>();

    public void preorder(TreeNode root) {
        if (root != null) {
            preorderedList.add(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }
}
