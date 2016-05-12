package solutions;

/**
 * Given a binary tree, write a method to find and return the sum of all the elements using recursion. For an empty
 * tree the sum is 0.
 */
public class Redo003SumBinaryTreeNodes {
    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return sum(root, 0);
        }
    }

    private int sum(TreeNode node, int sum) {
        if (node == null) {
            return sum;
        } else {
            return sum + node.data + sum(node.left, sum) + sum(node.right, sum);
        }
    }
}
