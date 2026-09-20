package homework3;

import java.util.Scanner;

public class question2 {
    static void main(String[] args) {
        System.out.println("Print counting from n to 1");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i=n ; i >=1 ; i--) {
            System.out.println(i);

        }



    }
}
