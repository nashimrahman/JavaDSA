package BasicMaths;

public class question1 {

    static void getDigits(int num){

        while (num !=0){
            //taking out the last digit
            int digit = num%10;
            //print the digit
            System.out.println(digit);
            //now update the value of num-> remove the last digit
            num = num/10;


        }

    }

    static void main() {
        getDigits(53456);

    }
}
