package Array;

import java.util.Scanner;

public class inputIn2DArray {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int arr[][] = new int[3][4];

        //taking input
        for (int i=0; i<= arr.length-1; i++){
            for (int j=0; j<= arr[i].length-1; j++){
                System.out.println("Value of row"+ i +" and col"+j);
                arr[i][j] = sc.nextInt();

            }
            //move to next row
            System.out.println();
        }

        //print
        for(int row=0; row<= arr.length-1; row++){
            for (int col= 0; col<= arr[row].length-1; col++){
                System.out.print(arr[row][col]+ " ");
            }

            System.out.println();

        }




    }
}
