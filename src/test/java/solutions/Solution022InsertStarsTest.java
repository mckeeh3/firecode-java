package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests {@link Solution022InsertStars}.
 */
public class Solution022InsertStarsTest {
    @Test
    public void stringCac() {
        assertEquals("cac", Solution022InsertStars.insertPairStar("cac"));
    }

    @Test
    public void stringCc() {
        assertEquals("c*c", Solution022InsertStars.insertPairStar("cc"));
    }

    @Test
    public void stringIsNull() {
        assertEquals(null, Solution022InsertStars.insertPairStar(null));
    }

    @Test
    public void stringA() {
        assertEquals("a", Solution022InsertStars.insertPairStar("a"));
    }

    @Test
    public void stringAb() {
        assertEquals("ab", Solution022InsertStars.insertPairStar("ab"));
    }
}
