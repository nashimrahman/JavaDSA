package ArrayProblemSolving;

public class question11 {
    static void main(String[] args) {
        // right shift array positions by 1
        int[] arr= {1,2,5,3,70};
        int n= arr.length;

        int temp = arr[n-1]; // last element is stored here
        //shifting elements -> from right
        for (int i=n-1; i>=1; i--){
            arr[i] = arr[i-1];
        }
        //updating arr[0]
        arr[0]= temp;
        //printing
        for(int ans: arr){
            System.out.print(ans + " ");
        }


    }
}
