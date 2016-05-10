package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution017FindMaxNode}.
 */
public class Solution017FindMaxNodeTest {
    @Test
    public void treeWithMax9() {
        TreeNode root = new TreeNode(6,
                new TreeNode(9,
                        new TreeNode(5, null, null),
                        new TreeNode(8, null, null)),
                new TreeNode(4, null, null)
        );

        Solution017FindMaxNode solution017FindMaxNode = new Solution017FindMaxNode();
        assertEquals(9, solution017FindMaxNode.findMax(root));
    }

    @Test
    public void treeWithMax7() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4, null, null),
                        new TreeNode(5, null, null)
                ),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null))
        );

        Solution017FindMaxNode solution017FindMaxNode = new Solution017FindMaxNode();
        assertEquals(7, solution017FindMaxNode.findMax(root));
    }

    @Test
    public void treeWithMax4() {
        TreeNode root = new TreeNode(4, null, null);

        Solution017FindMaxNode solution017FindMaxNode = new Solution017FindMaxNode();
        assertEquals(4, solution017FindMaxNode.findMax(root));
    }

    @Test
    public void treeWithMax45() {
        TreeNode root = new TreeNode(4,
                new TreeNode(40,
                        new TreeNode(41, null, null),
                        null),
                new TreeNode(45, null, null));

        Solution017FindMaxNode solution017FindMaxNode = new Solution017FindMaxNode();
        assertEquals(45, solution017FindMaxNode.findMax(root));
    }
}
