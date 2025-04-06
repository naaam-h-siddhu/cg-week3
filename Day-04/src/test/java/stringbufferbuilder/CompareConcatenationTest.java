package stringbufferbuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompareConcatenationTest {
    static String[] getStrings(int size){
        String[] strings = new String[size];
        for(int i = 0;i<size;i++){
            strings[i] = "String_"+i;
        }
        return strings;
    }

    @Test
    void main() {
        String[] strings = getStrings(10000);
        String result = CompareConcatenation.concatenateUsingBuffer(strings);
        String expected = CompareConcatenation.concatenateUsingBuilder(strings);
        assertEquals(expected,result);

    }
}