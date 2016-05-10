package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution015Anagram}.
 */
public class Solution015AnagramTest {
    @Test
    public void anagram_h_h() {
        assertTrue(Solution015Anagram.isAnagram("h", "h"));
    }

    @Test
    public void notAnagram_hello_hi() {
        assertFalse(Solution015Anagram.isAnagram("hello", "hi"));
    }

    @Test
    public void notAnagram_null_null() {
        assertFalse(Solution015Anagram.isAnagram(null, null));
    }

    @Test
    public void anagram_yellow_llowey() {
        assertTrue(Solution015Anagram.isAnagram("yellow", "llowey"));
    }

    @Test
    public void anagram_abcde_acdbe() {
        assertTrue(Solution015Anagram.isAnagram("abcde", "acdbe"));
    }
}
