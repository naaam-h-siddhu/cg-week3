package hashmaps.pairwithgivensum;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static boolean hasPair(int[] arr, int target){
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int required = target- arr[i];
            if(s.contains(required)){
                System.out.println("Yes pair is "+arr[i]+" and "+required);
                return true;
            }
            s.add(arr[i]);


        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15, 1, 8};
        int target = 9;
        hasPair(arr,target);
    }
}
