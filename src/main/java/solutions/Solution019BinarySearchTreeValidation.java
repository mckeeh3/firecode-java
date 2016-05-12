package solutions;

/**
 * Given the root node of a Binary Tree, determine if it is a Binary Search Tree.
 */
public class Solution019BinarySearchTreeValidation {
    public static boolean validateBST(TreeNode root) {
        return validate(root);
    }

    private static boolean validate(TreeNode node) {
        return node == null || validateLeft(node) && validateRight(node);
    }

    private static boolean validateLeft(TreeNode node) {
        return node.left == null || node.data > node.left.data && validate(node.left);
    }

    private static boolean validateRight(TreeNode node) {
        return node.right == null || node.data < node.right.data && validate(node.right);
    }
}
