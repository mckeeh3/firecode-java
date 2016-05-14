package solutions;

/**
 * Given a binary tree, write a method to return its size. The size of a tree is the number of nodes it contains.
 */
public class Redo016BinaryTreeSize {
    public int size(TreeNode root) {
        return root == null ? 0 : 1 + size(root.left) + size(root.right);
    }
}
