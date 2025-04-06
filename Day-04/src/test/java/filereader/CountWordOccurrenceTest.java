package filereader;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CountWordOccurrenceTest {

    @Test
    void wordCounter() {
        String path = "/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/main/resources/sample1.txt";


        try(BufferedReader br = new BufferedReader(new FileReader(path))){
           String line;
           while((line = br.readLine()) != null){
               CountWordOccurrence.wordCounter(line, "data");
           }

        }catch (IOException e){
           e.printStackTrace();
        }
        int result = CountWordOccurrence.wordCount;
        int expected = 86;
        assertEquals(expected,result);
    }
}