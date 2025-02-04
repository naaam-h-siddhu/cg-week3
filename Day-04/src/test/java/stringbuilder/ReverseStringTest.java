package stringbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void reverse() {
        String str = "abstract";
        String expected = "tcartsba";
        assertEquals(expected, ReverseString.reverse(str));
    }


}