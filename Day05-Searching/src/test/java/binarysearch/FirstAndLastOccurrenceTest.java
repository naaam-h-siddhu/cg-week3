package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstAndLastOccurrenceTest {

    private static int[] arr = {1,1,1,1,1,1,1,2,3,4,4,5,6,7};

    @Test
    void findFirst() {
        int result = FirstAndLastOccurrence.findFirst(arr,1);
        int expected = 0;
        assertEquals(expected,result);

    }

    @Test
    void findLast() {
        int result = FirstAndLastOccurrence.findLast(arr,1);
        int expected = 6;
        assertEquals(expected,result);
    }
}