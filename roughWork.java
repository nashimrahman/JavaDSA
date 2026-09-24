import java.util.Scanner;

public class roughWork {
    static void main(String[] args) {
        calculate(2,3,4);

    }
        public static void calculate(int a, int b, int optr) {
            // code here
            if(optr ==1){
                System.out.println(a+b);
            }
            else if(optr==2){
                System.out.println(a-b);
            }
            else if (optr==3){
                System.out.println(a*b);
            }
            else{
                System.out.println("Invalid Input");
            }
        }


}
