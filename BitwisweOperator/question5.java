package BitwisweOperator;

public class question5 {
    static void main(String[] args) {
        // swap two numbers using XOR
        int a= 6;
        int b= 7;

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a);
        System.out.println(b);



    }
}
