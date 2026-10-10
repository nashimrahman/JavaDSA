package ArrayProblemSolving;

public class question7 {
    static void main(String[] args) {
        // swap alternate elements in an array
        int[] arr= {1,2,5,3,7};
        int[] ans = swapElements(arr);

        for (int i: ans){
            System.out.print(i);
        }


    }

    static int[] swapElements(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            for (int j= i+1; j<n; j++){
                int exchange= arr[i];
                arr[i]= arr[j];
                arr[j]= exchange;
            }
        }

        return arr;
    }
}