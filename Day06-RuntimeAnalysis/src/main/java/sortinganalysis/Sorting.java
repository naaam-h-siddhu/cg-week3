package sortinganalysis;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Sorting {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low, right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= high) {
            if (arr[left] < arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }
        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static int partition(int[] arr, int low, int high) {
        // Random pivot selection
        int pivotIndex = new Random().nextInt(high - low + 1) + low;
        int pivot = arr[pivotIndex];

        // Swap pivot with the first element
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[low];
        arr[low] = temp;

        int i = low + 1, j = high;

        while (i <= j) {
            while (i <= j && arr[i] <= pivot) i++;
            while (i <= j && arr[j] > pivot) j--;

            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in correct position
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int j = partition(arr, low, high);
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }

    public static void main(String[] args) {
        int size = 100000;  // Reduced size to prevent long execution times
        int[] a = new int[size];
        int[] b = new int[size];
        int[] c = new int[size];

        for (int i = size - 1; i >= 0; i--) {
            a[i] = b[i] = c[i] = i;
        }

        long bubbleStart = System.nanoTime();
        bubbleSort(a);
        long bubbleEnd = System.nanoTime();

        long mergeStart = System.nanoTime();
        mergeSort(b, 0, b.length - 1);
        long mergeEnd = System.nanoTime();

        long quickStart = System.nanoTime();
        quickSort(c, 0, c.length - 1);
        long quickEnd = System.nanoTime();

        System.out.println("Time taken by Bubble Sort : " + (TimeUnit.NANOSECONDS.toMillis(bubbleEnd - bubbleStart)) + " ms");
        System.out.println("Time taken by Merge Sort  : " + (TimeUnit.NANOSECONDS.toMillis(mergeEnd - mergeStart)) + " ms");
        System.out.println("Time taken by Quick Sort  : " + (TimeUnit.NANOSECONDS.toMillis(quickEnd - quickStart)) + " ms");
    }
}
