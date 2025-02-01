package sorting.heapsort;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void heapify(ArrayList<Integer> arr, int n, int i){
        int largest = i;
        int left = 2*i +1;
        int right = 2*i +2;
        if(left < n && arr.get(left) > arr.get(largest)){
            largest = left;
        }
        if(right < n && arr.get(right) >  arr.get(largest))
            largest = right;
        if(largest != i){
            int temp = arr.get(i);
            arr.set(i,arr.get(largest));
            arr.set(largest, temp);

            heapify(arr,n,largest);
        }
    }
    public static void heapSort(ArrayList<Integer> arr){
        int n = arr.size();
        for(int i = (n/2)-1;i>=0;i--){
            heapify(arr,n,i);
        }
        for(int i = n-1;i>0;i--){
            int temp = arr.get(0);
            arr.set(0,arr.get(i));
            arr.set(i,temp);

            heapify(arr,i,0);
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(10,16,11,12,13,7,9));
        System.out.println("Array before sorting = "+arr);
        heapSort(arr);
        System.out.println("Array after sorting = "+arr);
    }
}
