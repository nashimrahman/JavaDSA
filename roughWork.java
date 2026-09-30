import java.util.ArrayList;
import java.util.Scanner;

public class roughWork {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int indexOfBuyDay=0;

        int minValue= prices[0];
        for(int i=0; i<=n-1; i++ ){
            if(prices[i]<= minValue){
                minValue = prices[i];
                indexOfBuyDay = i;
            }
            System.out.println("index of buy day: "+indexOfBuyDay);
            System.out.println("checking: "+prices[n-1]);
            if(indexOfBuyDay == prices[n-1]){
                return 0;
            }
        }



        int buyRs = minValue;

        int maxValue= prices[indexOfBuyDay];
        for(int i= indexOfBuyDay; i<= n-1; i++){
            if(prices[i] >= maxValue){
                maxValue = prices[i];
            }

        }


        return maxValue-buyRs;
    }

    static void main() {

        int[] arr= {2,4,1};
        System.out.println(maxProfit(arr));



    }















}