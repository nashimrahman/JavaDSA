package BitwisweOperator;

public class LeetCode136 {

    static void main(String[] args) {
        int[] arr ={2,2,1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {

        int xorSum = 0;
        for (int i : nums) {
            xorSum = xorSum ^ i;
        }
        return xorSum;
    }
}
