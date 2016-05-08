package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution002FindNodeInBinaryTree}.
 */
public class Solution002FindNodeInBinaryTreeTest {
    @Test
    public void findsExisting5In3LevelTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution002FindNodeInBinaryTree finder = new Solution002FindNodeInBinaryTree();
        TreeNode solution = finder.findNode(root, 5);

        assertNotNull(solution);
        assertEquals(5, solution.data);
    }

    @Test
    public void findsExisting7In3LevelTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution002FindNodeInBinaryTree finder = new Solution002FindNodeInBinaryTree();
        TreeNode solution = finder.findNode(root, 7);

        assertNotNull(solution);
        assertEquals(7, solution.data);
    }

    @Test
    public void doesNotFindNonExistingIn3LevelTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution002FindNodeInBinaryTree finder = new Solution002FindNodeInBinaryTree();
        TreeNode solution = finder.findNode(root, 0);

        assertNull(solution);
    }
}
