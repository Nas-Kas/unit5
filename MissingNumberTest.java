import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MissingNumberTest {
    private int[] missingMax = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    private int[] missingNone = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    private int[] missingEight = { 1, 2, 3, 4, 5, 6, 7, 9, 10 };
    private MissingNumber mn = new MissingNumber();

    @Test
    public void testMissingMax() {
        assertEquals(10, mn.findNum(missingMax, 10));
    }

    @Test
    public void testMissingNone() {
        assertEquals(0, mn.findNum(missingNone, 10));
    }

    @Test
    public void testMissingEight() {
        assertEquals(8, mn.findNum(missingEight, 10));
    }
}