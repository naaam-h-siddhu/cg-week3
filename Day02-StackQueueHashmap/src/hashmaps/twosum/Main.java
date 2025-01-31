package hashmaps.twosum;

import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static int[] getIndices(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){

            int required = target- arr[i];
            if(map.containsKey(required)){
                return new int[]{i,map.get(required)};
            }
            map.put(arr[i], i);

        }
        return null;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,2,4,5,12,6,7,8,9,11};
        int target = 12;

        int[] indices = getIndices(arr, target);
        System.out.println("Indices are : "+ Arrays.toString(indices));
    }
}

