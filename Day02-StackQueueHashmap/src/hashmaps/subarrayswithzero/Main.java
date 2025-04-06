package hashmaps.subarrayswithzero;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void findSubarray(int[] arr){
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if(map.containsKey(sum)){
                for(int id : map.get(sum)){
                    result.add(new int[]{id+1,i});
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);

        }
        if (result.isEmpty()) {
            System.out.println("No subarrays with zero sum found.");
        } else {
            System.out.println("Zero sum subarrays:");
            for (int[] subarray : result) {
                System.out.println("Start: " + subarray[0] + ", End: " + subarray[1]);
            }
        }

    }
    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4, -2, -2};
        findSubarray(arr);
    }
}
