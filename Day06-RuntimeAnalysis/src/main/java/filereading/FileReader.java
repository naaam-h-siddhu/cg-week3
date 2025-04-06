package filereading;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;

public class FileReader {
    static String filePath = "/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/main/resources/100mb" +
            "-examplefile-com.txt";

    public static void readUsingInputStreamReader(){
        try(FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(inputStreamReader)){
            String line;
            while((line = reader.readLine()) != null){

            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
    public static void readUsingFileReader(){
        try(java.io.FileReader fileReader = new java.io.FileReader(filePath);
        BufferedReader  reader = new BufferedReader(fileReader)){
            String line;
            while((line = reader.readLine()) != null){

            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        long start1 = System.nanoTime();
        readUsingFileReader();
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        readUsingInputStreamReader();
        long end2 = System.nanoTime();

        System.out.println("Time Taken by File Reader: "+ TimeUnit.NANOSECONDS.toMillis(end1-start1));
        System.out.println("Time Taken by Input Stream Reader: "+TimeUnit.NANOSECONDS.toMillis(end2-start2));

    }
}
