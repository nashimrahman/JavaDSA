package BitwisweOperator;

public class basics {
    static void main(String[] args) {

        int a=5;
        int b=6;
        System.out.println(a & b);  // and
        System.out.println(a | b);   // or
        System.out.println(a ^ b);   // xor
        System.out.println(~a);      // flipping all bits

        // left shift   formula= n*2^i
        int n=1;
        for (int i=0; i< 32; i++){
           n = n << 1;  // left shift
            System.out.println();
            System.out.println(n);
        }


        // right shift    formula= n/2^i
        int m=100;
        for (int i=0; i< 10; i++){
            m = m >> 1;  // right shift
            System.out.println();
            System.out.println(m);
        }



    }
}
