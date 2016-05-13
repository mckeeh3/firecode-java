package solutions;

/**
 * Write a function to find the total number of leaf nodes in a binary tree. A node is described as a leaf node if it
 * doesn't have any children. If there are no leaf nodes, return 0.
 */
public class Redo008CountTreeLeaves {
    public int numberOfLeaves(TreeNode root) {
        return root == null ? 0
                : root.left == null && root.right == null ? 1
                : numberOfLeaves(root.left) + numberOfLeaves(root.right);
    }
}
