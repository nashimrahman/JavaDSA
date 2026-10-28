import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        System.out.println(minEatingSpeed(piles, h));

    }
    public static int minEatingSpeed(int[] piles, int h) {

        int maxSpeed = 0;
        for (int i : piles) {
            if (i > maxSpeed) {
                maxSpeed = i;
            }
        }

        // search space
        int s = 1;
        int e = maxSpeed;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValid(piles, h, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    static boolean isValid(int[] arr, int timeLimit, int mid) {
        int hour = 0;
        for(int i =0; i< arr.length; i++) {
            int remainingBanana = arr[i];

            while(remainingBanana > 0){
                remainingBanana = remainingBanana - mid;
                hour++;
            }
            if(hour> timeLimit){
                return false;
            }

        }

        return true;
    }
}
