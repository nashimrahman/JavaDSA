package homework3;

import java.util.Scanner;

public class question3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the multiplication table of n upto 10");
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int mul;
        for(int i = 1; i <=10 ; i++) {
            mul = n*i ;
            System.out.println(n + "x" + i + " = " + (mul));

        }
    }
}
