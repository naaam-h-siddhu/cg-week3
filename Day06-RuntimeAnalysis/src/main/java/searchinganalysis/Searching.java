package searchinganalysis;

public class Searching {
    public static void generateArray(int[] arr){
        for (int i = 0; i < 1000002; i++) {
            arr[i] = i+1;
        }
    }
    public static int linearSearch(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start+end)/2;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;

            }
            else if(arr[mid] < target)
                start = mid+1;
            else
                end = mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int size = 1000000;
        int[] arr = new int[size];

        long linearStart = System.nanoTime();
        int linearIndex = linearSearch(arr,98754);
        long linearEnd = System.nanoTime();

        long binaryStart = System.nanoTime();
        int binaryIndex = binarySearch(arr,98754);
        long binaryEnd = System.nanoTime();

        System.out.println("Time taken by Linear Search : "+(linearEnd-linearStart));
        System.out.println("Time taken by Binary Search : "+(binaryEnd - binaryStart));



    }
}
