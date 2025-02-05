package inputstreamreader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ByteToCharacterConverter {
    public static void main(String[] args) {


        String path = "/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/main/resources/utfdemo.txt";
        try (FileInputStream fis = new FileInputStream(path);
             InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr)) {

            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
