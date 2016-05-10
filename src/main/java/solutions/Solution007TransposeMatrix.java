package solutions;

/**
 * You are given a square 2D image matrix where each integer represents a pixel. Write a method transposeMatrix to
 * transform the matrix into its Transpose - in-place. The transpose of a matrix is a matrix which is formed by
 * turning all the rows of the source matrix into columns and vice-versa.
 * 1 2 3    1 4 7
 * 4 5 6 => 2 5 8
 * 7 8 9    3 6 9
 */
public class Solution007TransposeMatrix {
    public static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = 0; j < matrix[i].length - 1 - i; j++) {
                int hold = matrix[i][j];
                int ii = matrix[i].length - 1 - j;
                int jj = matrix.length - 1 - i;
                matrix[i][j] = matrix[ii][jj];
                matrix[ii][jj] = hold;
            }
        }
    }
}
