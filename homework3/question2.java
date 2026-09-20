package homework3;

import java.util.Scanner;

public class question2 {
    static void main(String[] args) {
        System.out.println("Print counting from n to 1");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int p = 1;

        int i = 0;
        while (i <= n){
            n= n-p;
            System.out.println(n);
            i++;
        }



    }
}
