package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test {@link Solution019BinarySearchTreeValidation}.
 */
public class Solution019BinarySearchTreeValidationTest {
    @Test
    public void valid3levelTreeIsOk() {
        TreeNode root = new TreeNode(20,
                new TreeNode(15,
                        new TreeNode(15, null, null),
                        new TreeNode(18, null, null)),
                new TreeNode(30, null, null));

        assertTrue(Solution019BinarySearchTreeValidation.validateBST(root));
    }
}
