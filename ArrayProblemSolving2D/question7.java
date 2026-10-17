package ArrayProblemSolving2D;

import java.util.ArrayList;
import java.util.List;

public class question7 {
    static void main(String[] args) {
        // spiral print of a matrix
        int[][] arr = {
                {2, 8, 7, 4, 7},
                {8, 1, 9, 2, 3},
                {3, 5, 7, 1, 1},
                {2, 6, 4, 3, 5},
                {6, 2, 9, 2, 8},};

        List<Integer> list = new ArrayList<>();

        int n = arr.length;
        int m = arr[0].length;

        // pointers
        int startingRow = 0;
        int endingCol = m - 1;
        int endingRow = n-1;
        int startingCol = 0;

        // loop will run until
        while (startingRow<= endingRow && startingCol<= endingCol){
            //row wise left to right -> starting row print -> startingCol to endingCol print
            for (int col=startingCol; col<=endingCol; col++){
                list.add(arr[startingRow][col]);
            }
            startingRow++;


            //col wise top to bottom -> ending col print -> startingRow to endingRow print
            for (int row= startingRow; row<=endingRow; row++){
                list.add(arr[row][endingCol]);
            }
            endingCol--;


            // row wise right to left
            for (int col= endingCol; col>=startingCol; col--){
                list.add(arr[endingRow][col]);
            }
            endingRow--;


            // col wise bottom to top
            for (int row= endingRow; row>=startingRow; row--){
                list.add(arr[row][startingCol]);
            }
            startingCol++;
        }


        System.out.print(list);


    }
}
