package BasicMaths;

public class question2 {

    // count the number of digits

    static int countDigit(int num){

        int count=0;
        while(num !=0){
            int digit = num%10;
            count++;
            num = num/10;
        }
        return count;
    }

    static void main() {
        System.out.println(countDigit(9864874));


    }
}
