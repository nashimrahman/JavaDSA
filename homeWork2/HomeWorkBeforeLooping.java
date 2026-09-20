package homeWork2;

import java.util.Scanner;

public class HomeWorkBeforeLooping {
    static void main(String[] args) {
        percentage();
    }
    static void percentage(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt(); // subjects... n=5 means 5 subjects
        int FullMarks = n*100; // fullMarks will be 500

        int add= 0;
        for (int i=1; i<=n; i++) {
            int marks = sc.nextInt();
            add += marks;
        }
        float percentage = ((float) add /FullMarks)*100;
        System.out.print("Percentage is: " + percentage);


    }
}
