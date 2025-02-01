package sorting.countingsort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static ArrayList<Integer> countingSort(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int it :arr){
            maxi = Math.max(it, maxi);
        }
        int[] count = new int[maxi+1];
        for(int i = 0;i<arr.length;i++){
            count[arr[i]]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<=maxi;i++){
           while(count[i] > 0){
               ans.add(i);
               count[i]--;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] arr= {12,11,10,15,16,17};

       ArrayList<Integer> sortedArr = countingSort(arr);
        System.out.println("Array = "+ Arrays.toString(arr));
        System.out.println("Sorted Array = "+sortedArr);
    }
}
