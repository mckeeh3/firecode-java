package solutions;

/**
 * Given a binary tree, write a recursive method to return the maximum element.
 */
public class Redo017FindMaxNode {
    public int findMax(TreeNode root) {
        return root == null ? 0 : findMax(root, root.data);
    }

    private int findMax(TreeNode node, int max) {
        if (node == null) {
            return max;
        } else {
            max = Math.max(max, node.data);
            return Math.max(findMax(node.left, max), findMax(node.right, max));
        }
    }
}
