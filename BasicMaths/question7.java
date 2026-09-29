package BasicMaths;

import java.util.Scanner;

public class question7 {

    //prime number
    static boolean isPrime(int num){
        if (num==1){
            //1 is not a prime number
            return false;
        }

        for (int i=2; i<=num-1; i++){
            if (num%i ==0){
                //not a prime number
                return false;
            }
        }

        return true;
    }

    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();
        System.out.println(isPrime(n));

    }
}
