package ArrayProblemSolving;

public class question14 {
    static void main(String[] args) {
        // swap 0s and 1s
        int[] arr = {1,0,1,0,0,1};
        int n= arr.length;

        // two pointer
        int i= 0;
        int j= n-1;

        while(i<j){
            if (arr[i]==1 && arr[j]==0){
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if(arr[i] ==0){
                // move pointer to the right index
                i++;
            }
            if (arr[j]==1){
                // move pointer to the left index
                j--;
            }
        }
        // print
        for (int ans: arr){
            System.out.print(ans);
        }
    }
}
