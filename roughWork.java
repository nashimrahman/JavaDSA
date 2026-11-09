import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {

    static void main(String[] args) {
        int[] arr = {1,2,2,1};
        System.out.println(duplicateNumbersXOR(arr));




    }

    public static int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int key :nums){
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        int xorSum = 0;
        for(int i: map.keySet()){
            if(map.get(i) == 2){
                xorSum = xorSum^i;
            }
        }

        return xorSum;
    }


}
