package ArrayProblemSolving;

import java.util.*;


public class LeetCode169 {
    static void main(String[] args) {
        int[] arr = {2, 1, 2, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int key : nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i : map.keySet()) {
            int currentValue = map.get(i);
            if (currentValue > n / 2) {
                return i;
            }

        }
        return 0;
    }
}
