package homeWork2;

import java.util.Scanner;

public class lowerCase {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        String lowerCaseCh = sc.nextLine();
        lowerCaseCh= lowerCaseCh.toUpperCase();
        System.out.println("to Uppercase: "+lowerCaseCh);

    }
}
