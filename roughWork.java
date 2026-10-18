import javax.swing.*;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {
        int[] nums = {3,4,2,5,4,6};

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int key: nums){
            map.put(key, map.getOrDefault(key,0)+1);
        }

        System.out.println(map.keySet());
        System.out.println(map.values());

        for(int i: nums){
            if(((i&1)==0)  && map.get(i)== 1){
                System.out.println(i);
            }
        }

    }
}

