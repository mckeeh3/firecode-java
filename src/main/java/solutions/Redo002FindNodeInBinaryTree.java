package solutions;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a binary tree, write a method to find and return the node with data = the input data. Do not use recursion.
 */
public class Redo002FindNodeInBinaryTree {
    public TreeNode findNode(TreeNode root, int val) {
        TreeNode found = null;

        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.add(root);
        }

        while (!queue.isEmpty() && found == null) {
            TreeNode node = queue.poll();

            if (val == node.data) {
                found = node;
            } else {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return found;
    }
}
