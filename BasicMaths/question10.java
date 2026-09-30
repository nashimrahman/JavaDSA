package BasicMaths;

public class question10 {
    //armstrong number
    static int getDigits(int n){

        int count=0;
        while( n!=0){
            int digit= n%10;
            count++;
            n/=10;
        }
        System.out.println(count);
     return count;
    }

    static boolean isArmstrong(int num){
        int originalNum= num;
        int noOfDigits= getDigits(num);

        int sum=0;
        while( num!=0){
            int digit= num%10;
            int pow = (int) Math.pow(digit,noOfDigits);
            System.out.println(pow);
            sum +=pow;
            num /=10;

        }

        return sum == originalNum;
    }

    static void main() {

        System.out.println(isArmstrong(153));
    }
}
