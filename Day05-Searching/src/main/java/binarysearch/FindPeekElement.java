package binarysearch;

public class FindPeekElement {
    public static int findPeekElement(int[] arr){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left != right){
            int mid = (left+right)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])
                return mid;
            if(arr[mid+1] > arr[mid])
                left = mid+1;
            else right = mid;

        }
        return n-1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};
        int id = findPeekElement(arr);
        System.out.println(id);

    }
}

