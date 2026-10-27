import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};

        int max = prices[0];
        int min = prices[0];

        int buyDay = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= min) {
                min = prices[i];
                max = prices[i];
                buyDay = i;
            }
        }

        for (int i = buyDay; i < prices.length; i++) {
            if (prices[i] >= max) {
                max = prices[i];
            }
        }

        int profit = max - min;
        System.out.println(profit);


    }
}