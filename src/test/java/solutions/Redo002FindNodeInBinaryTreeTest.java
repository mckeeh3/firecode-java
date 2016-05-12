package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo002FindNodeInBinaryTree}.
 */
public class Redo002FindNodeInBinaryTreeTest {
    @Test
    public void find5in3levelTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Redo002FindNodeInBinaryTree redo002FindNodeInBinaryTree = new Redo002FindNodeInBinaryTree();
        TreeNode result = redo002FindNodeInBinaryTree.findNode(root, 5);
        assertEquals(5, result.data);
    }

    @Test
    public void notFind8in3levelTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Redo002FindNodeInBinaryTree redo002FindNodeInBinaryTree = new Redo002FindNodeInBinaryTree();
        TreeNode result = redo002FindNodeInBinaryTree.findNode(root, 8);
        assertNull(result);
    }

    @Test
    public void notFind1inNullTree() {
        Redo002FindNodeInBinaryTree redo002FindNodeInBinaryTree = new Redo002FindNodeInBinaryTree();
        TreeNode result = redo002FindNodeInBinaryTree.findNode(null, 8);
        assertNull(result);
    }
}
