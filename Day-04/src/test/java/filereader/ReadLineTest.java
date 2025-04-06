package filereader;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReadLineTest {

    @Test
    void readLine() {
        String result;
        try(BufferedReader br = new BufferedReader( new FileReader("/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/test/java/filereader/testing.txt"))){
            result = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String expected = "hi my name is siddhu";
        assertEquals(expected,result);
    }
}