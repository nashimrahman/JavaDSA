package methods;

import java.util.Scanner;

public class question3 {
    //main method
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println(isEven(n));

    }

    static Boolean isEven(int n){
        if (n%2==0){
            return true;
        }
        else return false;
    }


}
