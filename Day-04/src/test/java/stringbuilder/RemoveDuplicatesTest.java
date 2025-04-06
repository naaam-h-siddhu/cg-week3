package stringbuilder;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {

    @BeforeAll
    static void init(){
        System.out.println("Before all the test cases ");

    }
    static int count = 1;
    @BeforeEach
    void beforeeach(){
        System.out.println("before test " + count+" : ");
        count++;
    }
    @Test
    void removeDuplicates() {
        String str = "aabbcccddefg";
        String expected = "abcdefg";
        System.out.println("Testing 1");
        assertEquals(expected,RemoveDuplicates.removeDuplicates(str));
    }
    @Test
    void removeDupliates2(){
        String str = "abcaaaa";
        String expected = "abc";
        System.out.println("Testing 2");
        assertEquals(expected,RemoveDuplicates.removeDuplicates(str));
    }
}