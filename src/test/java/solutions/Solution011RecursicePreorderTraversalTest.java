package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution011RecursicePreorderTraversal}.
 */
public class Solution011RecursicePreorderTraversalTest {
    @Test
    public void level3() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution011RecursicePreorderTraversal solution011RecursicePreorderTraversal = new
                Solution011RecursicePreorderTraversal();
        solution011RecursicePreorderTraversal.preorder(root);
        assertEquals(1, (int) solution011RecursicePreorderTraversal.preorderedList.get(0));
        assertEquals(2, (int) solution011RecursicePreorderTraversal.preorderedList.get(1));
        assertEquals(4, (int) solution011RecursicePreorderTraversal.preorderedList.get(2));
        assertEquals(5, (int) solution011RecursicePreorderTraversal.preorderedList.get(3));
        assertEquals(3, (int) solution011RecursicePreorderTraversal.preorderedList.get(4));
        assertEquals(6, (int) solution011RecursicePreorderTraversal.preorderedList.get(5));
        assertEquals(7, (int) solution011RecursicePreorderTraversal.preorderedList.get(6));
    }
}
