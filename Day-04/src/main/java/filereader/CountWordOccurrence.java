package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountWordOccurrence {
    static int wordCount = 0;
    public static void wordCounter(String line, String target){
        StringBuilder str = new StringBuilder(line);
        String[] words = line.split(" ");
        for(String word : words){
            if(word.toLowerCase().equals(word))
                wordCount++;
        }

    }
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/main/resources/sample1.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine())!= null){
                wordCounter(line,"data");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("The count word \"Data \" in sample txt file is: "+wordCount);
    }
}
