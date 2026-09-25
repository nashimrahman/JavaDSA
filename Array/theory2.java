package Array;

import java.util.Scanner;

public class theory2 {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int[] arr = new int[5];

        //finding row length
        int n= arr.length;

        //taking input
        for (int index=0; index<= n-1; index++){
            System.out.println("Enter element of index "+ index);
            arr[index]= sc.nextInt();
        }

        //print elements
        System.out.print("Array is: ");
        for (int var: arr){
            System.out.println(var);
        }



    }
}
