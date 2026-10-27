import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {

        int[][] coins = {{8, 10, 1}, {1, 3, 2}, {5, 6, 4}};

        int[] arr = new int[15];

        int row = coins.length;
        int col = coins[0].length;

        for (int i = 0; i < row; i++) {
            int l = coins[i][0];
            int r = coins[i][1];
            int c = coins[i][2];

            for (int j = l; j <= r; j++) {
                arr[j] = c;
            }

        }

        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        // binary search
        int s = 0;
        int e = sum;
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;
            if(isValid(mid)){
                s = mid + 1;
            }
            else{
                ans = mid;
                e = mid - 1;
            }
        }




    }
}