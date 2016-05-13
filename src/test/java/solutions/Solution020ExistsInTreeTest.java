package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution020ExistsInTree}.
 */
public class Solution020ExistsInTreeTest {
    @Test
    public void element1existsIn3levelTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution020ExistsInTree solution020ExistsInTree = new Solution020ExistsInTree();
        assertTrue(solution020ExistsInTree.elemExist(root, 1));
    }

    @Test
    public void element6existsIn3levelTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution020ExistsInTree solution020ExistsInTree = new Solution020ExistsInTree();
        assertTrue(solution020ExistsInTree.elemExist(root, 6));
    }

    @Test
    public void element10notExistsIn3levelTree() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution020ExistsInTree solution020ExistsInTree = new Solution020ExistsInTree();
        assertFalse(solution020ExistsInTree.elemExist(root, 10));
    }
}
