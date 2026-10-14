package ArrayProblemSolving;
import java.util.*;

public class ThreeSum {
    //3 sum -> slow solution
    static void main(String[] args) {
        int[] arr = {-1,6,8,4,3,2,-8,9};
        System.out.println(threeSum(arr));

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int target = 0;

        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        //sort to remove the duplicates
                        Collections.sort(temp);
                        ans.add(temp);

                    }
                }
            }
        }

        // converting set into arraylist
        return new ArrayList<>(ans);
    }

}
