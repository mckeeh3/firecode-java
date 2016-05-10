package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution008CountTreeLeaves}.
 */
public class Solution008CountTreeLeavesTest {
    @Test
    public void t() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(8, null, null),
                                new TreeNode(9, null, null)),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution008CountTreeLeaves solution008CountTreeLeaves = new Solution008CountTreeLeaves();
        int leafCount = solution008CountTreeLeaves.numberOfLeaves(root);
        assertEquals(5, leafCount);
    }
}
