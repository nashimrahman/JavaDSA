package ArrayProblemSolving;

public class question10 {
    static void main(String[] args) {
        // reverse and array
        int[] arr= {1,2,5,3,7};
        int n= arr.length;

        int i= 0;
        int j= n-1;

        // two pointer approach
        while(i<=j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;

            i++;
            j--;
        }

        //printing array
        for(int ans: arr){
            System.out.print(ans);
        }

    }
}
