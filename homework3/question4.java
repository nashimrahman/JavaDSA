package homework3;

import java.util.Scanner;

public class question4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print your name 100 times");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        for(int i = 1; i <= 100 ; i++){
            System.out.println(name);
        }
    }
}
