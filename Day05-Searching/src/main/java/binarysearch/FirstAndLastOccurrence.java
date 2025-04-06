package binarysearch;

public class FirstAndLastOccurrence {
    public static int findFirst(int arr[] , int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int first =-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                first = mid;
                right = mid-1;

            } else if (arr[mid] < target) {
                left = mid+1;


            }
            else
                right = mid-1;
        }
        return first;


    }
    public static int findLast(int arr[] , int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        int last = -1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target)
            {

                last = mid;
                left = mid+1;

            }
            else if(arr[mid] < target){
                left = mid+1;
            }
            else
                right = mid-1;

        }
        return last;

    }

    public static void main(String[] args){

        int[] arr = {1,2,3,3,3,3,4,5};
        int first = findFirst(arr,3);
        int last = findLast(arr,3);
        System.out.println("The first occurrence of 3 is "+first);
        System.out.println("The last occurrence of 3 is "+last);



    }
}
