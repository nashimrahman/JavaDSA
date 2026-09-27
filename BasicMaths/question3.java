package BasicMaths;

public class question3 {

    // find the sum of digits

    static int sumDigits(int num){

        int sum=0;
        while (num!=0){
            // taking out the digit
            int digit = num%10;
            // adding digit
            sum = sum+ digit;
            // updating digits
            num = num/10;

        }
        return sum;
    }


    //main method
    static void main() {

        System.out.println(sumDigits(795934));


    }
}
