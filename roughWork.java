import java.util.ArrayList;
import java.util.Scanner;

public class roughWork {

    public static boolean isHappy(int num) {

        int sum=0;
        while(num !=0){
            int digit = num%10;
            sum = (int) (sum + Math.pow(digit,2));
            //removes the digit
            num/= 10;
        }

        int sum2=0;
        while(sum!=0){
            int digit = sum%10;
            sum2 = (int) (sum2 + Math.pow(digit,2));
            //removes the digit
            sum/=10;

        }



        return false;
    }

    static void main() {
        System.out.println(isHappy(19));
    }















}