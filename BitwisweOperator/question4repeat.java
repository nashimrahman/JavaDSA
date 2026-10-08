package BitwisweOperator;

public class question4repeat {
    static void main(String[] args) {
        // power of 2
        // direct formula -> n&(n-1) == 0 -> even

        int n =8;
        if ((n&(n-1)) ==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }

    }
}
