package inputstreamreader;

import filereader.ReadLine;
import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ConsolToFileTest {
    private static final String path = "/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/main/resources/newSampleTest.txt";

    @Test
    void fileWriteUsingUserInput() throws IOException {

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))){
            bufferedWriter.write("hi how are you siddhu");
//            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        String target = "hi how are you siddhu\n";
        String result = ReadLine.readLine(path);
        assertEquals(target,result,"File doesnt match");


    }
}