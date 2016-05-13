package solutions;

/**
 * Write a method - pow(x,n) that returns the value of x raised to the power of n (xn). n can be negative!
 */
public class Redo010PowerOfN {
    public static double pow(double x, int n) {
        double pow = 1;
        if (n > 0) {
            while (n-- > 0) {
                pow *= x;
            }
        } else {
            while (n++ < 0) {
                pow /= x;
            }
        }
        return pow;
    }
}
