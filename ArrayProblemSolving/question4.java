package ArrayProblemSolving;

public class question4 {
    static void main(String[] args) {
        // return the sum of positive and negative numbers
        int[] arr= {8,4,-6,9,-2,3,9};
        int[] ans = sum(arr);

        System.out.println(ans[0]);
        System.out.println(ans[1]);




    }

    static int[] sum(int[] arr){

        int positiveSum = 0;
        int negativeSum = 0;

        for (int i=0; i< arr.length; i++){
            if (arr[i]>0){
                positiveSum += arr[i];
            }
            if (arr[i]< 0){
                negativeSum += arr[i];
            }
        }
        int[] values= {positiveSum, negativeSum};

        return values;
    }



}
