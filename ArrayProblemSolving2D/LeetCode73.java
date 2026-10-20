package ArrayProblemSolving2D;

import java.util.ArrayList;
import java.util.List;

public class LeetCode73 {
    static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1},};

        int n = matrix.length;
        int m = matrix[0].length;

        List<Integer> row = new ArrayList<>();
        List<Integer> col = new ArrayList<>();

        // finding index of 0s -> then store it index in the lists
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);  // index of row
                    col.add(j);  // index of col
                }
            }
        }

        // setting rows
        for (int i = 0; i < row.size(); i++) {
            for(int j=0; j < m; j++) {
                matrix[row.get(i)][j] = 0;
            }
        }

        // setting cols
        for (int i = 0; i < col.size(); i++) {
            for(int j=0; j < n; j++) {
                matrix[j][col.get(i)] = 0;
            }
        }


        //print
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
