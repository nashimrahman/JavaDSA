import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        int[] ans = new int[nums.length];

        int[] bucket = new int[102];
        for (int i = 0; i < nums.length; i++)
            bucket[nums[i] + 1]++;

        for (int i = 1; i < 102; i++)
            bucket[i] += bucket[i - 1];

        for (int i = 0; i < nums.length; i++)
            nums[i] = bucket[nums[i]];

        for(int i:nums){
            System.out.print(i);
        }

    }
}
