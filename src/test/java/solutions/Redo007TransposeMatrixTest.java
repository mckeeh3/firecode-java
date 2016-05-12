package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tessts {@link Redo007TransposeMatrix}.
 */
public class Redo007TransposeMatrixTest {
    @Test
    public void transpose3by3matrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Redo007TransposeMatrix.transposeMatrix(matrix);
        assertEquals(1, matrix[0][0]);
    }
}
