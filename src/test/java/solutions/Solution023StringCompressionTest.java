package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution023StringCompression}.
 */
public class Solution023StringCompressionTest {
    @Test
    public void compressAbc() {
        assertEquals("abc", Solution023StringCompression.compresString("abc"));
    }

    @Test
    public void compressAa() {
        assertEquals("a2", Solution023StringCompression.compresString("aa"));
    }

    @Test
    public void compressAaa() {
        assertEquals("a3", Solution023StringCompression.compresString("aaa"));
    }

    @Test
    public void compressAbb() {
        assertEquals("ab2", Solution023StringCompression.compresString("abb"));
    }

    @Test
    public void compressAbbc() {
        assertEquals("ab2c", Solution023StringCompression.compresString("abbc"));
    }

    @Test
    public void compressAbbbc() {
        assertEquals("ab3c", Solution023StringCompression.compresString("abbbc"));
    }

    @Test
    public void compressAaabbbbbcccc() {
        assertEquals("a3b5c4", Solution023StringCompression.compresString("aaabbbbbcccc"));
    }
}
