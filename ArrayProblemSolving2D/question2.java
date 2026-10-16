package ArrayProblemSolving2D;

import java.util.ArrayList;
import java.util.List;

public class question2 {
    static void main(String[] args) {
        // print sum of each column

        int[][] arr= {
                {2,5,7},
                {8,1,9},
                {3,5,7},};

        List<Integer> list = new ArrayList<>();

        int n= arr.length;
        int m = arr[0].length;

        for (int col=0; col<m; col++){
            int sum=0;
            for (int row=0; row<n; row++){
                sum += arr[row][col];
            }
            list.add(sum);
        }

        System.out.println(list);





    }
}
