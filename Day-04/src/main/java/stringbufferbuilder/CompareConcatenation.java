package stringbufferbuilder;

public class CompareConcatenation {
    static long TimeOfBuffer = 0;
    static long TimeOfBuilder = 0;
    public static String concatenateUsingBuffer(String[] strings){
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer();
        for(String string: strings){
            sb.append(string);
        }
        long end = System.nanoTime();
        TimeOfBuffer = end-start;
        return sb.toString();
    }
    public static String concatenateUsingBuilder(String[] strings){
        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for(String string: strings){
            sb.append(string);
        }
        long end = System.nanoTime();
        TimeOfBuilder = end- start;
        return sb.toString();
    }
    public static void main(String[] args) {
        int size = 1000000;
        String[] strings = new String[size];
        for(int i = 0;i<size;i++){
            strings[i] = "String_"+i;
        }
        String concatenatedString1 = concatenateUsingBuffer(strings);
        String concatenatedString2 = concatenateUsingBuilder(strings);
        if(concatenatedString2.equals(concatenatedString1)){
            System.out.println("Yes They are equal !!");
        }
        else{
            System.out.println("No they are not equal !!");
        }
        System.out.println("Time taken by String buffer = "+TimeOfBuffer);
        System.out.println("Time taken by String builder = "+TimeOfBuilder);

    }
}
