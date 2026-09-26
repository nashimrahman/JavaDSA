package Array1D;

import java.util.Scanner;

public class question1 {
    static void main(String[] args) {


        // your code goes here
        Scanner sc = new Scanner(System.in);
        int noOfTestCase= sc.nextInt();


        for (int i=1; i<= noOfTestCase; i++){

            //no of elements in the array
            int noOfElements = sc.nextInt();

            //declare and allocate the array
            int arr[] = new int [noOfElements];
            int n= arr.length;

            //inserting values in the array
            for (int index=0; index<= n-1; index++){
                arr[index] = sc.nextInt();
            }

            //finding maxValue of the arrays
            int maxValue = arr[0];
            for (int index=0; index <= n-1; index++){
                if (arr[index] >= maxValue) {
                    maxValue= arr[index];
                }
            }

            System.out.println("Max value is: "+maxValue);
        }





    }
}
