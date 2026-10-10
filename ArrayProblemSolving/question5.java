package ArrayProblemSolving;

public class question5 {
    static void main(String[] args) {
        int[] arr = {1,0,1,0,0,1,1,1,1};
        int[] ans = countZeroAndOne(arr);

        System.out.println(ans[0]);
        System.out.println(ans[1]);

    }

    static int[] countZeroAndOne(int[] arr){
        int n = arr.length;
        int countOne=0;
        for (int i=0; i< n; i++){
            if(arr[i] ==1){
                countOne++;
            }
        }
        int countZero = n- countOne;

        int[] ans= {countOne, countZero};

        return ans;
    }




}
