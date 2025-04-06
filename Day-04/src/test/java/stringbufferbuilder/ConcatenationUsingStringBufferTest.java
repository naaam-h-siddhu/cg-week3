package stringbufferbuilder;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatenationUsingStringBufferTest {

    @Test
    void concatenate() {
        String[] strings = {"hi","siddhu"};
        String expected = "hi siddhu";
        assertEquals(expected,ConcatenationUsingStringBuffer.concatenate(strings));
    }
    @AfterAll
    static void endLine(){
        System.out.println("All test cases successfully !!!");
    }
}