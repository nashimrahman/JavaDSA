package ArrayProblemSolving;

public class question17 {
    static void main(String[] args) {
        // Two sum -> find two values which equals to the target
        int[] arr= {1,3,5,6,4};
        int n = arr.length;
        int target =10;

        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i]+ arr[j] == target){
                    int[] ans = {arr[i], arr[j]};
                    System.out.println(ans[0]);
                    System.out.println(ans[1]);
                }
            }
        }


    }
}
