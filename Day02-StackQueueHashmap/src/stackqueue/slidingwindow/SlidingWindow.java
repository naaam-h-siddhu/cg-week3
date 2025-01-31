package stackqueue.slidingwindow;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Enumeration;

public class SlidingWindow {

    public static int[] maximums(int[] arr, int k){
        int n = arr.length;
        int[] results = new int[n-k+1];
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // remove element not in the window
            while(!deque.isEmpty() && deque.peekFirst() < i-k+1){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && arr[deque.peekFirst()] < arr[i]){
                deque.pollFirst();
            }

            deque.offerLast(i);
            if(i>=k-1){
                results[i-k+1] = arr[deque.peekFirst()];
            }

        }
        return results;
    }
    public static void main(String[] args) {

        int[] arr = {9,5,8,7,3,1};
        int k = 3;
        int[] results = maximums(arr,k);
        System.out.println("Maximums are "+ Arrays.toString(results));

    }
}
