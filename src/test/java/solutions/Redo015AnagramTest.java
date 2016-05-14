package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test {@link Redo015Anagram}.
 */
public class Redo015AnagramTest {
    @Test
    public void anagram_h_h() {
        assertTrue(Redo015Anagram.isAnagram("h", "h"));
    }

    @Test
    public void notAnagram_hello_hi() {
        assertFalse(Redo015Anagram.isAnagram("hello", "hi"));
    }

    @Test
    public void notAnagram_null_null() {
        assertFalse(Redo015Anagram.isAnagram(null, null));
    }

    @Test
    public void anagram_yellow_llowey() {
        assertTrue(Redo015Anagram.isAnagram("yellow", "llowey"));
    }

    @Test
    public void anagram_abcde_acdbe() {
        assertTrue(Redo015Anagram.isAnagram("abcde", "acdbe"));
    }
}
