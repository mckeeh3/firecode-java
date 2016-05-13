package solutions;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Given a binary tree, write a method to iteratively traverse the tree in the preorder manner. Mark a node as
 * visited by adding its data to a list - Arraylist <Integer> preorderedList. Return this list.
 */
public class Redo012IteractivePreorderTraversal {
    public ArrayList<Integer> preorderItr(TreeNode root) {
        ArrayList<Integer> preordered = new ArrayList<>();
        if (root != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(root);
            while (!stack.isEmpty()) {
                TreeNode node = stack.pop();
                preordered.add(node.data);
                if (node.right != null) {
                    stack.push(node.right);
                }
                if (node.left != null) {
                    stack.push(node.left);
                }
            }
        }
        return preordered;
    }
}
