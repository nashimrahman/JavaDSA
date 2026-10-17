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

        // transpose the give matrix
        for (int i=0; i<n; i++){
            for(int j=i+1; j<m; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // now traverse rows in reverse direction
        for (int row=0; row< n; row++){
            for (int col=m-1; col>=0; col--){
                System.out.print(arr[row][col] + " ");
            }
            // move to next row
            System.out.println();
        }


    }
}
