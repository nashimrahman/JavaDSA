package ArrayProblemSolving;

public class questions1 {
    static void main(String[] args) {
        //find the average of array elements
        int[] arr= {8,4,6,9};
        System.out.println(getAverage(arr));

    }

    static double getAverage(int[] arr){
        int n = arr.length;
        int sum=0;
        for (int i=0; i<n; i++){
            sum+= arr[i];
        }

        return (double) sum /n;
    }



}
