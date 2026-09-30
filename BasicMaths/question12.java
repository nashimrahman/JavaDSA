package BasicMaths;

public class question12 {

    static void PrimeNumbers(int num){

        for (int digits=2; digits<= num; digits++){
            boolean prime = isPrime(digits);
            if (prime == true){
                System.out.println(digits);
            }

        }
    }

    static boolean isPrime(int num){
        for (int i=2; i*i <= num; i++){
            if (num%i ==0){
                return false;
            }
        }
        return true;
    }

    static void main() {
        PrimeNumbers(100);

    }



}
