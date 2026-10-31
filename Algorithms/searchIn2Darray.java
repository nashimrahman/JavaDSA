package Algorithms;

public class searchIn2Darray {
    static void main(String[] args) {
        //if matrix is sorted

        int[][] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {22, 23, 26, 30},
        };

        int target = 16;
        System.out.println(searchMatrix(arr, target));

    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int totalRow = matrix.length;
        int totalCol = matrix[0].length;

        // search space
        int s = 0;
        int e = totalRow * totalCol - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            int rowIndex = mid / totalCol;
            int colIndex = mid % totalCol;

            if (matrix[rowIndex][colIndex] == target) {
                return true;
            }
            if (matrix[rowIndex][colIndex] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

        }

        return false;
    }
}
