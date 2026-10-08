package BitwisweOperator;

public class countSetBits {
    static void main(String[] args) {

        int n= 7;
        int count= 0;
        // jab tak set bit 0 na ho jai tab tak loop chalega
        while( n != 0){
            if ((n&1) != 0){
                count++;
            }
            //right shift to remove the bit
            n = n>>1;
        }
        // print
        System.out.println("Count: "+count);


    }
}
