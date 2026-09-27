package BasicMaths;

public class question5 {

    static boolean isPalindrome(int num){

        int originalDigit = num;
        int reverseDigit= reverseDigit(num);
        if (originalDigit == reverseDigit){
            return true;
        }

        return false;
    }

    static int reverseDigit(int num) {
        int reverse=0;
        while(num!= 0){
            //taking out the digit
            int digit = num%10;
            //reverse the digit
            reverse = reverse*10+ digit;
            //removing the digit
            num = num/10;

        }
        return reverse;
    }

    static void main() {
        System.out.println(isPalindrome(12321));

    }
}
