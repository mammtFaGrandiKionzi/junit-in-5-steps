import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyMathTest {

    private MyMath myMath = new MyMath();

    // CREATE A METHOD TO CHECK IF THE SUM OF AN ARRAY
    // HAS THE EXPECTED RESULT
    @Test
    void sum() {
        int result = myMath.sum();
        int expectedResult = 6;

        assertEquals(expectedResult, result);
    }

    // ========================================== //
    // RANGA EXERCISE //
    // CREATE AN EMPTY ARRAY AND CHECK WITH THE TEST IF THE RESULT IS ZERO
    @Test
    public void isZero() {
        int[] emptyArray = {};

        for (int i : emptyArray) {
            assertNull(i);
        }
    }

    @Test
    public void isZero02() {
        int[] emptyArray = {};
        int sum = 0;

        for (int i = 0; i < emptyArray.length; i++) {
            sum += emptyArray[i];
        }

        assertEquals(0, sum);
    }

}