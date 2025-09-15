// File: ArraysUtilTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class arraysTest {

    @Test
    void testFillArrayReturnsSameArray() {
        int[][] sample = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        int[][] result =arrays.fillArray(sample);

        // verify length and content
        assertEquals(3, result.length);
        assertArrayEquals(new int[]{1,2,3}, result[0]);
        assertArrayEquals(new int[]{4,5,6}, result[1]);
        assertArrayEquals(new int[]{7,8,9}, result[2]);
    }
}
