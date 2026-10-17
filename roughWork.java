import javax.swing.*;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {
        int[] nums = {20, 10, 30, 30, 40, 30, 40};

        HashMap<Integer, Integer> map = new LinkedHashMap<>();
        HashMap<Integer, Integer> map2 = new LinkedHashMap<>();


        for (int key : nums) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (int i : map.values()) {
            map2.put(i, map2.getOrDefault(i, 0) + 1);
        }

        for (int j : map.keySet()) {
            if (map2.get(map.get(j)) == 1) {
                System.out.println(j);
            }

        }


    }
}

