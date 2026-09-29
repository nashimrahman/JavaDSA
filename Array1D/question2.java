package Array1D;

public class question2 {
    //leetcode 268
    public static int missingNumber(int[] nums) {
        int n= nums.length;
        int sum=0;
        int sum2=0;
        //sum of array elements
        for (int i=0; i<= n-1; i++) {
            sum+= nums[i];
        }
        //sum of n-> 0 to n
        for (int i=0;i<=n; i++){
            sum2+= i;
        }

     return sum2-sum;
    }

    static void main() {
        int[] arr = {0,1};
        System.out.println(missingNumber(arr));

    }
}
