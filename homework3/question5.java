package homework3;


public class question5 {
    static void main(String[] args) {
        System.out.println("Print all prime numbers from 1 to 100");

        // 1 is not a prime number and 2 is the only even prime number
        for (int i = 2; i < 100; i++) {
            if (i ==2){
                System.out.println(i);
            }
            else if (i % 2 != 0) {
                System.out.println(i);
            }

        }


    }
}
