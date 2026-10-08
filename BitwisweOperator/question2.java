package BitwisweOperator;

public class question2 {
    static void main(String[] args) {

        int n=6;
        System.out.println("Multiply by 2 "+(n << 1));

        // left shift   formula= n*2^i
        for (int i=0; i< 32; i++){
            n = n << 1;
            System.out.println();
            System.out.println(n);

        }

    }
}
