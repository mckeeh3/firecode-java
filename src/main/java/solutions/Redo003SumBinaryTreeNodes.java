package solutions;

/**
 * Given a binary tree, write a method to find and return the sum of all the elements using recursion. For an empty
 * tree the sum is 0.
 */
public class Redo003SumBinaryTreeNodes {
    public int sum(TreeNode root) {
        return root == null ? 0 : root.data + sum(root.left) + sum(root.right);
    }
}
