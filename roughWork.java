import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {

    static void main(String[] args) {
        int[] arr = {1, 1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));


    }

        public static int findMaxConsecutiveOnes(int[] nums) {

            List<Integer> list = new ArrayList<>();

            int max = 0;
            for(int i =0; i<nums.length; i++){
                int count = 0;
                if(nums[i] == 1){
                    count++;
                }
                list.add(count);
            }

            for(int i=0; i< list.size(); i++){
                if(list.get(i) >= max){
                    max = list.get(i);
                }
            }

            return max;
        }
    }


