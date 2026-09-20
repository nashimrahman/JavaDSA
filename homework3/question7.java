package homework3;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print the sum of all the numbers from 1 to n");
        System.out.print("Enter n:");
        int n = sc.nextInt();

        //logic
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
