package solutions;

import java.util.Stack;

/**
 * Given a binary tree, write a method to find and return the node with data = the input data. Do not use recursion.
 */
public class Solution002FindNodeInBinaryTree {
    public TreeNode findNode(TreeNode root, int val) {
        TreeNode treeNode = root;
        boolean found = false;
        Stack<TreeNode> parents = new Stack<>();

        while (treeNode != null && !found) {
            if (treeNode.data == val) {
                found = true;
            } else {
                if (treeNode.left != null) {
                    parents.push(new TreeNode(treeNode.data, null, treeNode.right));
                    treeNode = treeNode.left;
                } else if (treeNode.right != null) {
                    parents.push(new TreeNode(treeNode.data, null, null));
                    treeNode = treeNode.right;
                } else if (parents.isEmpty()) {
                    treeNode = null;
                } else {
                    treeNode = parents.pop();
                }
            }
        }

        return treeNode;
    }
}
