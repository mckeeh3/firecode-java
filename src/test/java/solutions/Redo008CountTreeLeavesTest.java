package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo008CountTreeLeaves}.
 */
public class Redo008CountTreeLeavesTest {
    @Test
    public void emptyTree() {
        Redo008CountTreeLeaves redo008CountTreeLeaves = new Redo008CountTreeLeaves();
        assertEquals(0, redo008CountTreeLeaves.numberOfLeaves(null));
    }

    @Test
    public void levels4leaves5() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(8, null, null),
                                new TreeNode(9, null, null)),
                        new TreeNode(5, null, null)),
                new TreeNode(3,
                        new TreeNode(6, null, null),
                        new TreeNode(7, null, null)));

        Redo008CountTreeLeaves redo008CountTreeLeaves = new Redo008CountTreeLeaves();
        assertEquals(5, redo008CountTreeLeaves.numberOfLeaves(root));
    }
}
