package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution021HeightOfTree}.
 */
public class Solution021HeightOfTreeTest {
    @Test
    public void emptyTree() {
        Solution021HeightOfTree solution021HeightOfTree = new Solution021HeightOfTree();
        assertEquals(0, solution021HeightOfTree.findHeight(null));
    }

    @Test
    public void levels3() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution021HeightOfTree solution021HeightOfTree = new Solution021HeightOfTree();
        assertEquals(3, solution021HeightOfTree.findHeight(root));
    }

    @Test
    public void levels4() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5,
                                null,
                                new TreeNode(6, null, null))),
                new TreeNode(3,
                        new TreeNode(7, null, null),
                        new TreeNode(8, null, null)));

        Solution021HeightOfTree solution021HeightOfTree = new Solution021HeightOfTree();
        assertEquals(4, solution021HeightOfTree.findHeight(root));
    }
}
