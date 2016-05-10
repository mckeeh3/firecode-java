package solutions;

import java.util.ArrayList;

/**
 * Given a binary tree, write a method to iteratively traverse the tree in the preorder manner. Mark a node as
 * visited by adding its data to a list - Arraylist <Integer> preorderedList.
 */
public class Solution012IterativePreorderTraversal {
    public ArrayList<Integer> preorderItr(TreeNode root) {
        ArrayList<Integer> preorder = new ArrayList<Integer>();

        preorder(root, preorder);

        return preorder;
    }

    private void preorder(TreeNode node, ArrayList<Integer> preorder) {
        if (node != null) {
            preorder.add(node.data);
            preorder(node.left, preorder);
            preorder(node.right, preorder);
        }
    }
}
