package BitwisweOperator;

public class question7 {
    static void main(String[] args) {

        // remove last set bit -> n&(n-1) this removes the last set Bit
        // power of two has only one setBit so it converts the number into zero

        // get last setBit -> n&(-n) this converts the all the setBits into zero except the last one

        int n=10;
        System.out.println(n&(n-1));
        // removing the last setBit makes it 8
        System.out.println(n&(-n));


    }
}
