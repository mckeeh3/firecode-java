package solutions;

/**
 * Given the root node of a Binary Tree, determine if it is a Binary Search Tree.
 */
public class Solution019BinarySearchTreeValidation {
    public static boolean validateBST(TreeNode root) {
        return root == null || validate(root, root.left) && validate(root, root.right);
    }

    private static boolean validate(TreeNode root, TreeNode node) {
        return node == null
                || findNode(root, node.data) != null
                && validate(root, node.left)
                && validate(root, node.right);
    }

    private static TreeNode findNode(TreeNode node, int x) {
        if (node == null) {
            return null;
        } else if (x == node.data) {
            return node;
        } else if (x < node.data) {
            return findNode(node.left, x);
        } else {
            return findNode(node.right, x);
        }
    }
}
