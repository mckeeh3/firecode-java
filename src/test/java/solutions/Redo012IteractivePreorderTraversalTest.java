package solutions;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo012IteractivePreorderTraversal}.
 */
public class Redo012IteractivePreorderTraversalTest {
    @Test
    public void levels3tree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Redo012IteractivePreorderTraversal redo012IteractivePreorderTraversal = new
                Redo012IteractivePreorderTraversal();

        List<Integer> preorder = redo012IteractivePreorderTraversal.preorderItr(root);
        assertEquals(1, (int) preorder.get(0));
        assertEquals(2, (int) preorder.get(1));
        assertEquals(4, (int) preorder.get(2));
        assertEquals(5, (int) preorder.get(3));
        assertEquals(3, (int) preorder.get(4));
        assertEquals(6, (int) preorder.get(5));
        assertEquals(7, (int) preorder.get(6));
    }
}
