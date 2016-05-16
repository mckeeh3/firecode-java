package solutions;

/**
 * You are given a square 2D image matrix where each integer represents a pixel. Write a method rotateSquareImageCW
 * to rotate the image clockwise - in-place.
 */
public class Solution028RotateSquareImage {
    public static void rotateSquareImageCW(int[][] matrix) {
        transpose(matrix);
        rotate(matrix);
    }

    private static void transpose(int[][] matrix) {
        for (int i = 0; i < matrix.length - 1; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int hold = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = hold;
            }
        }
    }

    private static void rotate(int[][] matrix) {
        int left = 0;
        int right = matrix.length - 1;
        while (left < right - (matrix.length % 2 == 0 ? 0 : 1)) {
            for (int row = 0; row < matrix.length; row++) {
                int hold = matrix[row][left];
                matrix[row][left] = matrix[row][right];
                matrix[row][right] = hold;
            }
            left++;
            right--;
        }
    }
}
