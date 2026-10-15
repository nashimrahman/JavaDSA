import java.util.*;

public class roughWork {
    public static void main(String[] args) {

        int[] nums = {2, 1, 2, 1, 1, 2, 2};
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int key : nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i: map.keySet()){
            int currrentKey =i;
            int currentValue= map.get(i);
            if (currentValue>n/2){
                System.out.println(currrentKey);
            }

        }


    }
}

