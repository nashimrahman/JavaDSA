import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {

    static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
//        [1,4,2,3,3,2,4,1]
        int n = 4;
        int[] ans = shuffle(arr, n);

        for(int i: ans){
            System.out.print(i);
        }
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int i = 0;
        int j = n;

        for(int index = 0; index < n; index++){
                ans[2*index] = nums[i];  // store in the odd index
                i++;
                ans[2*index+1] =  nums[j];  // store in the even index
                j++;
        }

        return ans;
    }

}
