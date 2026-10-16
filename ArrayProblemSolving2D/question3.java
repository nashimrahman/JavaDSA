package ArrayProblemSolving2D;

public class question3 {
    static void main(String[] args) {
        // wave print of a matrix
        int[][] arr= {
                {2,8,7,4},
                {8,1,9,2},
                {3,5,7,1},
                {2,6,4,3},};

        int n= arr.length;
        int m= arr[0].length;

        for (int col=0; col<m; col++){
            // index even-> print top to bottom
            if ((col&1)==0){
                // top to bottom
                for (int row=0; row<n; row++){
                    System.out.print(arr[row][col]);
                }
            }
            // else -> print bottom to top
            else {
                for (int row=n-1; row>=0; row--){
                    System.out.print(arr[row][col]);
                }
            }

        }



    }
}
