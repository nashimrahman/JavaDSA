package ArrayProblemSolving2D;

public class question4 {
    static void main(String[] args) {
        // transpose of a matrix
        int[][] arr = {
                {2, 8, 7, 4},
                {3, 5, 7, 1},
                {2, 6, 4, 3},};

        // old lengths of array
        int n = arr.length;
        int m = arr[0].length;

        // new length of array -> 3x2 matrix becomes 2x3 now
        int newRow = m;
        int newCol = n;

        // ans array
        int[][] ans = new int[newRow][newCol];

        //logic
        for (int row=0; row<n; row++){
            for(int col=0; col<m ; col++){
                ans[col][row] = arr[row][col];
            }
        }

        //print
        for(int i=0; i < newRow; i++){
            for (int j=0; j< newCol; j++){
                System.out.print(ans[i][j] + " ");
            }
            //move to next row
            System.out.println();
        }



    }
}
