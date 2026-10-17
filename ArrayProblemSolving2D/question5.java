package ArrayProblemSolving2D;

public class question5 {
    static void main(String[] args) {
        // rotate a matrix by 90 degrees
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},};

        int n = arr.length;
        int m = arr[0].length;

        int newRow = m;
        int newCol = n;

        int[][] transposeMatrix = new int[newRow][newCol];

        for (int i=0; i<n; i++){
            for(int j=0; j<m; j++){
               transposeMatrix[i][j] = arr[j][i];
            }
        }

        // now rotate 90 degree -> traverse in new array
        for (int row=0; row< newRow; row++){
            for (int col=newCol-1; col>=0; col--){
                System.out.print(transposeMatrix[row][col] + " ");
            }
            // move to next row
            System.out.println();
        }


    }
}
