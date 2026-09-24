package methods;

import java.util.Scanner;

public class question5 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total marks: ");
        int total= sc.nextInt();
        System.out.print("Enter obtained marks: ");
        int obtained= sc.nextInt();
        System.out.println(calculatePercentage(obtained,total));


    }

    static float calculatePercentage(int obtained, int total){
        return ((float) obtained /total)*100;
    }
}
