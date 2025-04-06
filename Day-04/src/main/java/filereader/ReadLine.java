package filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
    public static String readLine(String path){
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line;
            while((line = br.readLine()) != null){
                sb.append(line);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       return sb.toString();
    }

    public static void main(String[] args){
        String path = "/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/main/resources/sample3.txt";
        String text = readLine(path);
        System.out.println(text);


    }
}

