package ArrayProblemSolving;

public class LeetCode724 {
    // pivot index
    static void main(String[] args) {
        int[] arr = {1,7,3,6,5,6};
        int n = arr.length;

        // finding sum from left and right
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int sum=0;
        int sum2=0;
        // running sum right array
        for(int i=0;i<n;i++){
            sum += arr[i];
            rightSum[i] = sum;
        }

        // running sum of left array
        for(int i= n-1; i>=0; i--){
            sum2 += arr[i];
            leftSum[i] = sum2;
        }

        //finding pivot index
        for(int i=0; i<n; i++){
            if (leftSum[i] == rightSum[i]) System.out.println(i);
        }

    }
}
