package sorting.bubblesort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]){
                    // swap
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
       int[] arr = {12,10,11,13,9,8};
        System.out.println("array before sorting "+ Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Array after sorting "+Arrays.toString(arr
        ));


    }
}
