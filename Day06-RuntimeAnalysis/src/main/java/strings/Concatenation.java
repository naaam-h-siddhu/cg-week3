package strings;


import java.util.concurrent.TimeUnit;

public class Concatenation {

    public static long getTimeOfString(int N){
        long start = System.nanoTime();
        String str = "";
        for(int i = 0;i<N;i++){
            str += "b";
        }
        long end = System.nanoTime();
        return end-start;
    }
    public static long getTimeOfStringBuilder(int N){
        long start  = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<N;i++){
            sb.append("a");
        }
        long end = System.nanoTime();
        return end-start;

    }
    public static long getTimeOfStringBuffer(int N){
        long start = System.nanoTime();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < N; i++) {
            sb.append("a");
        }
        long end = System.nanoTime();
        return end-start;
    }
    public static void main(String[] args) {
        int size = 1000000;
        long stringTime = getTimeOfString(size);
        long stringBuilderTime = getTimeOfStringBuilder(size);
        long stringBufferTime = getTimeOfStringBuffer(size);
        System.out.println("Time taken by String: "+ TimeUnit.NANOSECONDS.toMillis(stringTime));
        System.out.println("Time taken by String Builder: "+TimeUnit.NANOSECONDS.toMillis(stringBuilderTime));
        System.out.println("Time taken by String Buffer: "+TimeUnit.NANOSECONDS.toMillis(stringBufferTime));

    }
}

