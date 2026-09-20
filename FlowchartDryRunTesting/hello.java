package FlowchartDryRunTesting;

import java.util.Scanner;

public class hello{
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numers you want to numliply: ");
        int inputForN = sc.nextInt();
        int mul =1;
        for (int i= 1; i<= inputForN; i++){
            System.out.print("Enter your numbers: ");
            int number = sc.nextInt();
            mul *=number;
        }
        System.out.println("Multiplication of Given Two Number is: "+ mul);
    }
}
