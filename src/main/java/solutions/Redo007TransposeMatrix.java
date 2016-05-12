package solutions;

/**
 * You are given a square 2D image matrix where each integer represents a pixel. Write a method transposeMatrix to
 * transform the matrix into its Transpose - in-place.
 */
public class Redo007TransposeMatrix {
    public static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int hold = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = hold;
            }
        }
    }
}
