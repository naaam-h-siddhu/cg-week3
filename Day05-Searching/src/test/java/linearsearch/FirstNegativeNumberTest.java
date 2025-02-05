package linearsearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNegativeNumberTest {

    static int[] arr = {4,1,4,-15,-3};
    @Test
    void linearSearchFirstNegative() {
        int expected = 3;
        int result= FirstNegativeNumber.linearSearchFirstNegative(arr);
        assertEquals(expected,result);
    }
}