package ArrayProblemSolving;

public class kedanesAlgorithm {
    static void main(String[] args) {
        // See Notes

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            //step1: creating sum
            sum += arr[i];
            //step2: updating max
            maxSum = Math.max(maxSum, sum);
            //step3: checking sum-> 0 if negative
            if(sum<0) sum=0;

        }

        //print
        System.out.println(maxSum);
    }
}
