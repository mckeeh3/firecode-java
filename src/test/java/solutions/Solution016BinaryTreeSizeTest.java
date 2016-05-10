package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution016BinaryTreeSize}.
 */
public class Solution016BinaryTreeSizeTest {
    @Test
    public void treeWith5nodes() {
        TreeNode root = new TreeNode(6,
                new TreeNode(4,
                        null,
                        new TreeNode(5, null, null)
                ),
                new TreeNode(8,
                        new TreeNode(7, null, null),
                        null
                )
        );

        Solution016BinaryTreeSize solution016BinaryTreeSize = new Solution016BinaryTreeSize();
        assertEquals(5, solution016BinaryTreeSize.size(root));
    }

    @Test
    public void treeWith7nodes() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)
                ),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null))
        );

        Solution016BinaryTreeSize solution016BinaryTreeSize = new Solution016BinaryTreeSize();
        assertEquals(7, solution016BinaryTreeSize.size(root));
    }
}
