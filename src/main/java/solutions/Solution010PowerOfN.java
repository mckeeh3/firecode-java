package solutions;

/**
 * Write a method - pow(x,n) that returns the value of x raised to the power of n (xn). n can be negative!
 */
public class Solution010PowerOfN {
    public static double pow(double x, int n) {
        double answer = x;

        if (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                answer *= x;
            }
            return answer;
        } else if (n < 0) {
            for (int i = 0; i < -n + 1; i++) {
                answer /= x;
            }
            return answer;
        } else {
            return 1;
        }
    }
}
