package sorting.insertionsort;

import java.util.Arrays;

public class Main {
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<= n-1;i++){
            int j= i;
            while(j > 0 && arr[j-1] >arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        int[] arr= {1,4,2,0,65,32,11,21};
        System.out.println("Array before sorting  = "+ Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Array after sorting = "+Arrays.toString(arr));

    }
}
