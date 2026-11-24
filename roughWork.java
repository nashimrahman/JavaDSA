import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {

    static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] ans = sortByBits(arr);
        for (int i : ans) {
            System.out.println(i);
        }
    }

    public static int[] sortByBits(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            // jab tak set bit 0 na ho jai tab tak loop chalega
            while (arr[i] != 0) {
                if ((arr[i] & 1) != 0) {
                    count++;
                }
                //right shift to remove the bit
                arr[i] = arr[i] >> 1;
            }
            System.out.println(count);
            map.put(arr[i], count);
        }

        System.out.println(map.keySet());
        System.out.println(map.values());


        return new int[]{0};
    }
}


