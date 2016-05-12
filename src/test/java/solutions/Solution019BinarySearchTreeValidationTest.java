package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test {@link Solution019BinarySearchTreeValidation}.
 */
public class Solution019BinarySearchTreeValidationTest {
    @Test
    public void nullTreeIsBinarySearchTree() {
        assertTrue(Solution019BinarySearchTreeValidation.validateBST(null));
    }

    @Test
    public void valid3levelTreeIsOk() {
        TreeNode root = new TreeNode(20,
                new TreeNode(15,
                        new TreeNode(14, null, null),
                        new TreeNode(18, null, null)),
                new TreeNode(30, null, null));

        assertTrue(Solution019BinarySearchTreeValidation.validateBST(root));
    }

    @Test
    public void invalid3levelTreeIsNotOkV1() {
        TreeNode root = new TreeNode(20,
                new TreeNode(30,
                        new TreeNode(14, null, null),
                        new TreeNode(18, null, null)),
                new TreeNode(15, null, null));

        assertFalse(Solution019BinarySearchTreeValidation.validateBST(root));
    }

    @Test
    public void invalid3levelTreeIsNotOkV2() {
        TreeNode root = new TreeNode(20,
                new TreeNode(15,
                        new TreeNode(10, null, null),
                        new TreeNode(30, null, null)),
                new TreeNode(40, null, null));

        assertFalse(Solution019BinarySearchTreeValidation.validateBST(root));
    }
}
