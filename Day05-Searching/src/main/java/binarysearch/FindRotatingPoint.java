package binarysearch;

public class FindRotatingPoint {
    public static int findRotatingPoint(int arr[]){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        while(e!=s){
            int mid = (s+e)/2;
            if(arr[mid] > arr[e])
                s = mid+1;
            if(arr[mid] < arr[e])
                e = mid;

        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,1,2,3,4,5};
        int index = findRotatingPoint(arr);
        System.out.println(index);

    }
}
