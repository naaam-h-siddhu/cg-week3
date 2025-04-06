package searchinganalysis;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

public class CompareSearching {
    public  static int searchInArray(int[] arr, int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
    public static int searchInHashSet(HashSet<Integer> hs, int target){
        if(hs.contains(target))
        {
            return target;
        }
        return -1;
    }
    public static int searchInTreeSet(TreeSet<Integer> ts, int target){
        if(ts.contains(target))
            return target;
        return -1;
    }

    public static void main(String[] args) {
        int size = 10000000;
        Random random = new Random();
        int[] randomNumbers = new int[size];

        int targetIndex = random.nextInt(size);

        int target = randomNumbers[targetIndex];

        for(int i = 0;i<size;i++){
            randomNumbers[i] = random.nextInt(size)+1;
        }

        HashSet<Integer> hs = new HashSet<>();
        for(int i : randomNumbers) hs.add(i);

        TreeSet<Integer> ts = new TreeSet<>();
        for(int i : randomNumbers) ts.add(i);

        long startTimeOfLinearSearch = System.nanoTime();
        int result1 = searchInArray(randomNumbers,target);
        long endTimeOfLinearSearch = System.nanoTime();


        long startTimeOfHashMap = System.nanoTime();
        int result2 = searchInHashSet(hs,target);
        long endTimeOfHashMap = System.nanoTime();

        long startTimeOfTreeSet = System.nanoTime();
        int result3 = searchInTreeSet(ts,target);
        long endTimeOfTreeSet = System.nanoTime();


        System.out.println("Time taken by array search: "+ (endTimeOfLinearSearch-startTimeOfLinearSearch) +
                " nanoseconds");
        System.out.println("Time taken by HashMap: "+(endTimeOfHashMap-startTimeOfHashMap) + " nanoseconds");
        System.out.println("Time taken by TreeSet: "+(endTimeOfTreeSet-startTimeOfTreeSet)+" nanoseconds");
    }
}
