package BitwisweOperator;

public class firstSetBit {
    static void main(String[] args) {
        //You have to return the position of the first setBit  from the right side

        int n=16;
        int position =1;
        // jab tak n&1==0 tab tak loop chalega
        while((n&1) ==0){
            // n&1 ==1 hua toh
            n = n>>1; // right shift to remove the SetBit
            position++;
        }
        System.out.println(position);
    }
}
