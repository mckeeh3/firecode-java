package solutions;

/**
 * Given a binary tree, write a method to find its height recursively. An empty tree has a height of 0.
 */
public class Solution021HeightOfTree {
    public int findHeight(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }
}
