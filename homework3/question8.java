package homework3;


public class question8 {
    public static void main(String[] args) {
        System.out.println("Print all integers in range from 50 to 100, that are perfectly divisible by 7");

        int n= 100;

        for (int i = 50; i <= n; i++) {
            if (i%7==0){
                System.out.println(i);
            }



        }
    }
}
