package com.extras;
import java.util.ArrayList;

import static java.lang.Math.*;
public class ChallengeProblem {

    public static int findFirstMissingPositiveInteger(int arr[] ){
        int maxi = Integer.MIN_VALUE;
        for(int it: arr){
            maxi = max(maxi, it);

        }
        int[] hashArray = new int[maxi+1];
        for(int i =0;i<arr.length;i++){
            hashArray[arr[i]] = 1;
        }
        for(int i =1;i<= hashArray.length;i++){
            if(hashArray[i] != 1){
                return i;
            }
        }
        return -1;
    }
    public static void mergeSort(int[] arr, int low, int high){
        if(low>=high) return;
        int mid = (low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);

    }
    public static void merge(int[] arr, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left= low;
        int right = mid+1;
        while(left<=mid && right <= high){
            if(arr[left] <= arr[right])
            {
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low;i<=high;i++){
            arr[i] = temp.get(i-low);
        }

    }
    public static int binarySearch(int[] arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {7,8,4,3,10,2,1,5,9};
        int firstPositive = findFirstMissingPositiveInteger(arr);
        System.out.println("First Missing positive integer : "+firstPositive);
        mergeSort(arr,0, arr.length-1);
        int target = 7;
        int index = binarySearch(arr, target);
        System.out.println("The index of 7 after sorting is "+index);
    }
}
