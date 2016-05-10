package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution007TransposeMatrix}.
 */
public class Solution007TransposeMatrixTest {
    @Test
    public void transpose2by2v1() {
        int[][] matrix = {{1, 0}, {1, 0}};
        Solution007TransposeMatrix.transposeMatrix(matrix);
        assertEquals(0, matrix[0][0]);
        assertEquals(0, matrix[0][1]);

        assertEquals(1, matrix[1][0]);
        assertEquals(1, matrix[1][1]);
    }

    @Test
    public void transpose2by2v2() {
        int[][] matrix = {{1, 0}, {0, 0}};
        Solution007TransposeMatrix.transposeMatrix(matrix);
        assertEquals(0, matrix[0][0]);
        assertEquals(0, matrix[0][1]);

        assertEquals(0, matrix[1][0]);
        assertEquals(1, matrix[1][1]);
    }

    @Test
    public void transpose3by3v1() {
        int[][] matrix = {{1, 0, 1}, {1, 0, 1}, {1, 0,1}};
        Solution007TransposeMatrix.transposeMatrix(matrix);
        assertEquals(1, matrix[0][0]);
        assertEquals(1, matrix[0][1]);
        assertEquals(1, matrix[0][2]);

        assertEquals(0, matrix[1][0]);
        assertEquals(0, matrix[1][1]);
        assertEquals(0, matrix[1][2]);

        assertEquals(1, matrix[2][0]);
        assertEquals(1, matrix[2][1]);
        assertEquals(1, matrix[2][2]);
    }

    @Test
    public void transpose3by3v2() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution007TransposeMatrix.transposeMatrix(matrix);
        assertEquals(9, matrix[0][0]);
        assertEquals(6, matrix[0][1]);
        assertEquals(3, matrix[0][2]);

        assertEquals(8, matrix[1][0]);
        assertEquals(5, matrix[1][1]);
        assertEquals(2, matrix[1][2]);

        assertEquals(7, matrix[2][0]);
        assertEquals(4, matrix[2][1]);
        assertEquals(1, matrix[2][2]);
    }
}
