package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo011RecursivePreorderTraversal}.
 */
public class Redo011RecursivePreorderTraversalTest {
    @Test
    public void levels3tree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Redo011RecursivePreorderTraversal redo011RecursivePreorderTraversal = new Redo011RecursivePreorderTraversal();
        redo011RecursivePreorderTraversal.preorder(root);
        assertEquals(1, (int) redo011RecursivePreorderTraversal.preorderedList.get(0));
        assertEquals(2, (int) redo011RecursivePreorderTraversal.preorderedList.get(1));
        assertEquals(4, (int) redo011RecursivePreorderTraversal.preorderedList.get(2));
        assertEquals(5, (int) redo011RecursivePreorderTraversal.preorderedList.get(3));
        assertEquals(3, (int) redo011RecursivePreorderTraversal.preorderedList.get(4));
        assertEquals(6, (int) redo011RecursivePreorderTraversal.preorderedList.get(5));
        assertEquals(7, (int) redo011RecursivePreorderTraversal.preorderedList.get(6));
    }
}
