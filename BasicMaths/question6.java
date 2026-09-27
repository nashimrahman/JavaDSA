package BasicMaths;

public class question6 {
    //leetcode 258
    public static int addDigits(int num) {

        int sum = 0;
        //this taking out the digits
        while (num != 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }


        //this loop taking the digits until the sum becomes single digit
        while (sum >= 10) {
            //initializing the final sum variable
            int sum2 = 0;
            while (sum != 0) {
                int digit = sum % 10;
                sum2 = sum2 + digit;
                sum /= 10;
            }
            sum = sum2;
        }


        return sum;
    }

    static void main() {
        System.out.println(addDigits(19));

    }
}
