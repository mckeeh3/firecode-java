package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution004IsIntegerPalindrome}.
 */
public class Solution004IsIntegerPalindromeTest {
    @Test
    public void negative1IsNotPalindrome() {
        boolean isPalindrome = Solution004IsIntegerPalindrome.isIntPalindrome(-1);
        assertFalse(isPalindrome);
    }

    @Test
    public void zeroIsPalindrome() {
        boolean isPalindrome = Solution004IsIntegerPalindrome.isIntPalindrome(0);
        assertTrue(isPalindrome);
    }

    @Test
    public void value1221IsPalindrome() {
        boolean isPalindrome = Solution004IsIntegerPalindrome.isIntPalindrome(1221);
        assertTrue(isPalindrome);
    }

    @Test
    public void value8998IsPalindrome() {
        boolean isPalindrome = Solution004IsIntegerPalindrome.isIntPalindrome(8998);
        assertTrue(isPalindrome);
    }

    @Test
    public void value78987IsPalindrome() {
        boolean isPalindrome = Solution004IsIntegerPalindrome.isIntPalindrome(78987);
        assertTrue(isPalindrome);
    }
}
