package sorting.mergesort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void merge(int[] arr, int low,int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        //merge all from left side
        while(left<= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        // transfer temp to arr;
        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i - low);
        }
    }
    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high )
            return;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);


    }
    public static void main(String[] args) {
        int[] arr = {1,3,2,7,4,6,2};
        System.out.println("Array before sort : "+ Arrays.toString(arr));
        mergeSort(arr,0,arr.length-1);
        System.out.println("Array after sorting : "+ Arrays.toString(arr));

    }
}
