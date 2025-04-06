package hashmaps.longestconsecutivesequence;

import java.util.HashSet;
import java.util.Map;

public class Main {
    public static int longest(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int ans = 0;
        for(int num : set){
            if(!set.contains(num-1)) {
                int curr = num;
                int currS = 1;
                while (set.contains(curr + 1)) {
                    currS++;
                    curr++;
                }

                ans = Math.max(currS, ans);
            }

        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7, 8,9};
        System.out.println("Longest sequence = "+longest(arr));

    }
}
