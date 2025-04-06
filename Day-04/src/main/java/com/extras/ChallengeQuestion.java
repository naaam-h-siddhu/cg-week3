package com.extras;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ChallengeQuestion {
    private static String[] strings = new String[1000000];

    private static void generateStringArray(){
        for(int i = 0;i<1000000;i++){
            strings[i] = "hello_"+i;

        }

    }

    static int wordCount1 = 0;
    static int wordCount2 = 0;


    public static long getBufferTiming(String[] strings){
        long start = System.nanoTime();
        StringBuffer sb =new StringBuffer();
        for(String string : strings)
            sb.append(string);
        long end = System.nanoTime();
        return end-start;
    }
    public static  long getBuilderTiming(String[] strings){
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(String string : strings){
            sb.append(string);

        }
        long end = System.nanoTime();
        return end-start;
    }

    public static long getTimeTakenByInputStreamReader(){
        long start = System.nanoTime();
        try(FileInputStream fileInputStream = new FileInputStream(filePath);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(inputStreamReader)){
            String line;
            while((line = reader.readLine()) != null){
                String[] strings1 = line.split(" ");
                wordCount1+=strings1.length;
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        long end = System.nanoTime();
        long timeInMilliSecond = TimeUnit.NANOSECONDS.toMillis(end-start);
        return timeInMilliSecond;



    }
    public static long getTimeTakenByFileReader(){
        long start = System.nanoTime();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = reader.readLine()) != null){
                String[] strings1 = line.split( " ");
                wordCount2+=strings1.length;


            }
        }catch (IOException e){
            e.printStackTrace();
        }
        long end = System.nanoTime();
        long timeInMilliSecond = TimeUnit.NANOSECONDS.toMillis(end-start);
        return timeInMilliSecond;

    }


    static String filePath = "/Users/siddhu/Desktop/cg-tut/Week3/Day-04/src/main/resources/100mb" +
            "-examplefile-com.txt";




    public static void main(String[] args) {
        generateStringArray();
        long bufferTime = getBufferTiming(strings);
        long builderTime = getBuilderTiming(strings);
        System.out.println("Time taken to concatenate string using string buffer: "+bufferTime);
        System.out.println("Time taken to concatenate string using string builder : "+builderTime);
        System.out.println("Difference :"+ Math.abs(bufferTime-builderTime));


        long timeTakenByFileReader = getTimeTakenByFileReader();
        long timeTakenByInputStreamReader = getTimeTakenByInputStreamReader();

        System.out.println("Time taken by 'FileReader' to count the number of words =  "+timeTakenByFileReader);
        System.out.println("Time taken by 'InputStreamReader' to count the number words = "+timeTakenByInputStreamReader);
        System.out.println("Difference : "+Math.abs(timeTakenByFileReader-timeTakenByInputStreamReader));


    }



}