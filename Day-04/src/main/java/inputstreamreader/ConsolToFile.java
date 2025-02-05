package inputstreamreader;

import java.io.*;

public class ConsolToFile {

    public static void FileWriteUsingUserInput(String path){
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            FileWriter fileWriter = new FileWriter(path,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            String input;
            System.out.println("Enter text and type 'done' to stop");
            while(!(input = bufferedReader.readLine()).equalsIgnoreCase("done")){
                bufferedWriter.write(input);
                bufferedWriter.newLine();
            }



        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        String path = "/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/main/resources/newSample.txt";
        FileWriteUsingUserInput(path);

    }
}
