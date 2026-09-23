package homework3;


public class question5 {
    static void main(String[] args) {
        System.out.println("Print all prime numbers from 1 to 100");

        // 1 is not a prime number and 2 is the only even prime number
        int n= 100;

        for (int i = 2; i < n; i++) {
            if (n % i != 0) {
                System.out.println(i);
            }

        }


    }
}
