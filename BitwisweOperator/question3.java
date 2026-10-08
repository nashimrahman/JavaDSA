package BitwisweOperator;

public class question3 {
    static void main(String[] args) {

        // right shift    formula= n/2^i

        int n= 100;
        System.out.println("Divide by 2: " +(n>>1));

        for(int i=0; i< 10; i++){
            n = n >> 1;
            System.out.println();
            System.out.println(n);
        }





    }
}
