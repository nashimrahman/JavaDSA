package BitwisweOperator;

import java.util.Scanner;

public class question4 {
    static void main(String[] args) {

        // check power of 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n= sc.nextInt();


        // logic
        // even number have only one setBit of 1 -> we have to check the bits

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
        if (count == 1){
            System.out.println("Yes it is a power of two ");
        }
        else {
            System.out.println("No");
        }



    }
}
