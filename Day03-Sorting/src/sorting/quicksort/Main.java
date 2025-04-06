package sorting.quicksort;

import java.util.Arrays;

public class Main {
    public static int partition(int[] arr,int low, int high){
        int pivot = low;
        int i = low, j= high;

        while(i<j){
            while(i<= j && arr[i] <= arr[pivot]){
                i++;
            }
            while(i<= j && arr[j] > arr[pivot]) {
                j--;
            }


            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }

        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;


    }
    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int j = partition(arr,low,high);
            quickSort(arr,low,j);
            quickSort(arr,j+1,high);

        }
    }
    public static void main(String[] args) {
        int[] arr = {10,16,8,12,15,6,3,9,5};
        System.out.println("Array before sorting: "+ Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println("Array after sorting "+Arrays.toString(arr));

    }
}

