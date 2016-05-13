package solutions;

/**
 * Given a binary tree, write an iterative method to determine if the given element N exists in the tree.
 */
public class Solution020ExistsInTree {
    public boolean elemExist(TreeNode root, int data) {
        return root != null && (root.data == data || elemExist(root.left, data) || elemExist(root.right, data));
    }
}
