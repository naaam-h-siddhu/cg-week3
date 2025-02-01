package sorting.selectionsort;

import java.util.Arrays;

public class Main {
    public static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int mini = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[mini] > arr[j])
                    mini = j;
            }
            int temp = arr[i];
            arr[i] = arr[mini];
            arr[mini] = temp;

        }
    }
    public static void main(String[] args) {
        int[] arr = {5,3,4,1,2,7,8,6};
        System.out.println("Array before sorting : "+ Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Array after sorting : "+Arrays.toString(arr));
    }
}
