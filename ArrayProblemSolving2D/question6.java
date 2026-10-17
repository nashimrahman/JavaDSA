package ArrayProblemSolving2D;

public class question6 {
    static void main(String[] args) {
        // rotate a matrix by 90 degrees
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},};

        int n = arr.length;
        int m = arr[0].length;

        // transpose the give matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < m; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // now reverse the rows -> reverse using Two Pointer
        for (int row = 0; row < n; row++) {
            // now I'm in new row
            int starCol = 0;
            int endCol = m - 1;

            while (starCol <= endCol){
                // swap
                int temp = arr[row][starCol];
                arr[row][starCol] = arr[row][endCol];
                arr[row][endCol] = temp;

                //updating pointers
                starCol++;
                endCol--;
            }
        }


    }
}
