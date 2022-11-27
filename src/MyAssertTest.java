import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyAssertTest {

    private List<String> myList = Arrays.asList("AWS", "DevOps", "Azure");

    // ========================================== //
    // BOOL ASSERT //
    @Test
    public void boolAssert() {
        boolean aws = myList.contains("AWS");
        boolean angular = myList.contains("Angular");
        //assertEquals(true, aws);
        assertTrue(aws);
        assertFalse(angular);
    }

    // ========================================== //
    // ASSERT WITH INT (BUT THERE IS AN ASSERT FOR EVERY PRIMARY TYPE)
    // Java Primary Types:  int, byte, short, long, float, double, boolean, and char.
    @Test
    public void sizeCheck() {
        assertEquals(3, myList.size());
    }

    // ========================================== //
    // CUSTOM MESSAGE //
    @Test
    public void seeCustomMessageIfError() {
        assertEquals(10, myList.size(), "Test failed, move ur ass..");
    }

    // ========================================== //
    // ARRAY ASSERT //
    @Test
    public void assertWithArrays() {
        // REMEMBER //
        // LEFT SIDE, CREATING A NEW expected ARRAYS
        // RIGHT SIDE, GIVING THE RESULT WE ARE TAKING
        assertArrayEquals(new int[] {1,2}, new int[] {1,2}); // GREEN JUNIT
        assertArrayEquals(new int[] {1,2}, new int[] {2,1}); // RED JUNIT

        assertArrayEquals(new String[] {"AWS"}, new String[] {"AWS", "DevOps", "Azure"});
    }

}