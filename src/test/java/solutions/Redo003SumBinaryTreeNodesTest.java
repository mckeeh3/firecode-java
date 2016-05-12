package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo003SumBinaryTreeNodes}.
 */
public class Redo003SumBinaryTreeNodesTest {
    @Test
    public void sumNullTree() {
        Redo003SumBinaryTreeNodes redo003SumBinaryTreeNodes = new Redo003SumBinaryTreeNodes();
        assertEquals(0, redo003SumBinaryTreeNodes.sum(null));
    }

    @Test
    public void sum1node() {
        TreeNode root = new TreeNode(1, null, null);
        Redo003SumBinaryTreeNodes redo003SumBinaryTreeNodes = new Redo003SumBinaryTreeNodes();
        assertEquals(1, redo003SumBinaryTreeNodes.sum(root));
    }

    @Test
    public void sum3level5nodeTree() {
        TreeNode root = new TreeNode(6,
                new TreeNode(4,
                        new TreeNode(2, null, null),
                        null),
                new TreeNode(8,
                        null,
                        new TreeNode(9, null, null)));

        Redo003SumBinaryTreeNodes redo003SumBinaryTreeNodes = new Redo003SumBinaryTreeNodes();
        assertEquals(29, redo003SumBinaryTreeNodes.sum(root));
    }

    @Test
    public void sum4level4nodeTree() {
        TreeNode root = new TreeNode(9,
                new TreeNode(8,
                        new TreeNode(4,
                                null,
                                new TreeNode(6, null, null)),
                        null),
                null);

        Redo003SumBinaryTreeNodes redo003SumBinaryTreeNodes = new Redo003SumBinaryTreeNodes();
        assertEquals(27, redo003SumBinaryTreeNodes.sum(root));
    }
}
