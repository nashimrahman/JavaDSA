package Algorithms;

public class searchIn2DArrayII {
    static void main(String[] args) {

        int[][] arr = {
                {1, 3, 5, 7},
                {2, 11, 16, 20},
                {5, 23, 26, 30},
        };

        int target = 16;
        System.out.println(searchMatrix(arr, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        // start from top corner
        int row = 0;
        int col = totalCol - 1;

        while(row < totalRow && col>= 0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] > target){
                col--; // move left
            } else {
                row++; // move right
            }
        }


        return false;
    }

}
