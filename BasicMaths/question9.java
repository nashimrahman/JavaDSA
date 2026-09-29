package BasicMaths;

public class question9 {
    static int findLCM(int a, int b){
        // LCM= a*b/gcd
        return a*b/findGCD(a,b);


    }
    static int findGCD(int a, int b){
        while(b!=0){
            int initialValueOfB=b;
            b = a%b;
            a = initialValueOfB;

        }
        return a;
    }

    static void main() {
        System.out.println(findLCM(18,12));

    }
}
