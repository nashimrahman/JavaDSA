package ArrayProblemSolving;

public class kedanesAlgorithm {
    static void main(String[] args) {
        // See Notes

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // adding values
            sum += arr[i];
            if (sum >= maxSum) {
                // updating sum
                maxSum = sum;
            } else if (sum < 0) {
                sum = 0;
            }
        }

        //print
        System.out.println(maxSum);
    }
}
