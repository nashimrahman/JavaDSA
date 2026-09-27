package BasicMaths;

public class question4 {

    //reverse the number
     static int reverseDigit(int num) {
         // taking out the digit

         int reverse=0;
         while (num != 0) {
             //taking out last digit
             int digit = num % 10;
             // reversing the digits
             reverse = reverse*10 + digit;
             //removing the last digit
             num = num / 10;
         }

         return reverse;
     }

    static void main() {
         int original= 121;
        System.out.println(reverseDigit(original));
        if (reverseDigit(original) == original){
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }



    }
}
