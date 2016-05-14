package solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests {@link Redo016BinaryTreeSize}.
 */
public class Redo016BinaryTreeSizeTest {
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

        Redo016BinaryTreeSize redo016BinaryTreeSize = new Redo016BinaryTreeSize();
        assertEquals(5, redo016BinaryTreeSize.size(root));
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

        Redo016BinaryTreeSize redo016BinaryTreeSize = new Redo016BinaryTreeSize();
        assertEquals(7, redo016BinaryTreeSize.size(root));
    }
}
