package solutions;

/**
 * Given a binary tree, write a recursive method to return the maximum element.
 */
public class Solution017FindMaxNode {
    public int findMax(TreeNode root) {
        if (root != null) {
            return findMax(root, root.data);
        } else {
            return Integer.MIN_VALUE;
        }
    }

    private int findMax(TreeNode node, int max) {
        if (node == null) {
            return max;
        } else if (max < node.data) {
            max = node.data;
        }
        return Math.max(findMax(node.left, max), findMax(node.right, max));
    }
}
