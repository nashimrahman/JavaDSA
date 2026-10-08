package BitwisweOperator;

public class question7 {
    static void main(String[] args) {
        // remove last set bit
        // n&(n-1) this removes the last set bit
        // power of two has only one set bit so it converts the number into zero

        int n=10;
        System.out.println(n&(n-1));
        // removing the last setBit makes it 8


    }
}
