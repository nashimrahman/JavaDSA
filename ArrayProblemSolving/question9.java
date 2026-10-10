package ArrayProblemSolving;

public class question9 {
    static void main(String[] args) {
        //Print Extreme elements in an alternate manner
        int[] arr= {1,2,5,3,7};
        int n= arr.length;

        int i=0;
        int j= n-1;

        while(i<=j) {
            if (i == j) {
                System.out.println(arr[i]);
                return;
            } else {
                //i < j
                System.out.print(arr[i]);
                i++;
                System.out.print(arr[j]);
                j--;

            }
        }





    }
}
