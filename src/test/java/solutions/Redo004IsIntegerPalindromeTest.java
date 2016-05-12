package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Redo004IsIntegerPalindrome}.
 */
public class Redo004IsIntegerPalindromeTest {
    @Test
    public void negative1notPalindrome() {
        assertFalse(Redo004IsIntegerPalindrome.isIntPalindrome(-1));
    }

    @Test
    public void zeroIsPalindrome() {
        assertTrue(Redo004IsIntegerPalindrome.isIntPalindrome(0));
    }

    @Test
    public void value232isPalindrome() {
        assertTrue(Redo004IsIntegerPalindrome.isIntPalindrome(232));
    }

    @Test
    public void value1221isPalindrome() {
        assertTrue(Redo004IsIntegerPalindrome.isIntPalindrome(1221));
    }

    @Test
    public void value123421isNotPalindrome() {
        assertFalse(Redo004IsIntegerPalindrome.isIntPalindrome(123421));
    }
}
