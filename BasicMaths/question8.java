package BasicMaths;

public class question8 {
    static int findGCD(int a, int b){
        // gcd(a,b) = gcd(b, a%b)

        while( b != 0){
            int oldValueOfB = b;
            b = a%b;
            a = oldValueOfB;

        }

        return a;
    }

    static void main() {

        System.out.println(findGCD(18,12));
    }


}
