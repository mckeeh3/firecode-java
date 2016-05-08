package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution003SumBinaryTreeNodes}.
 */
public class Solution003SumBinaryTreeNodesTest {
    @Test
    public void t() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(8, null, null),
                                null),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Solution003SumBinaryTreeNodes solution003SumBinaryTreeNodes = new Solution003SumBinaryTreeNodes();
        int sum = solution003SumBinaryTreeNodes.sum(root);

        assertEquals(36, sum);
    }
}
