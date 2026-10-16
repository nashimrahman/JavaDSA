package ArrayProblemSolving2D;

import java.util.ArrayList;
import java.util.List;

public class question1 {
    static void main(String[] args) {
        // print sum of each row

        int[][] arr= {
                {2,5,7},
                {8,1,9},
                {3,5,7},};

        List<Integer> list = new ArrayList<>();

        // length of row
        int n= arr.length;
        // length of column
        int m = arr[0].length;

        //traverse
        for (int row=0; row<n; row++){
            int sum=0; // sum will reset to 0-> after traversing each row
            for (int col=0; col<m; col++){
                sum += arr[row][col];
            }
            // after finding sum of each row
            list.add(sum);
        }

        System.out.println(list);


    }
}
