package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeekElementTest {

    @Test
    void findPeekElement() {
        int[] arr = {1,2,3,4,5,6};
        int id = FindPeekElement.findPeekElement(arr);
        int expected = arr.length-1;
        assertEquals(expected,id);

    }

     @Test
    void FindPeekElementRotatedArray(){
        int[] arr = {3,4,5,1,2};
        int id = FindPeekElement.findPeekElement(arr);
        int expected = 2;
        assertEquals(expected,id);
     }
}