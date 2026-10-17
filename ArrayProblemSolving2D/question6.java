package ArrayProblemSolving2D;

public class question6 {
    static void main(String[] args) {
        // find transpose without creating a new matrix

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},};

        int n = arr.length;
        int m = arr[0].length;

        for (int i=0; i< n; i++){
            // upper triangle martix
            for(int j=i+1; j<m; j++){
                // swap
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //print
        for(int row=0; row< n; row++){
            for(int col=0; col< m; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }




    }
}
