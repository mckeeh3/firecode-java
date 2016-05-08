package solutions;

/**
 * A TreeNode that can be used in binary trees.
 */
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return String.format("%s[%s]", getClass().getSimpleName(), data);
    }
}
