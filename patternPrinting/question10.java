package patternPrinting;

/*

        *
      *   *
    *       *
  *           *
* * * * * * * * *


*/


public class question10 {
    public static void main(String[] args) {

        int n= 5;

        for (int row= 1; row<= n; row++){
            //for each row-> variable column
            //outer spaces
            for (int col= 1; col<= n-row; col++){
                //print space
                System.out.print("  ");
            }
            //solid stars
            if (row== 1 || row== n){
                for (int col= 1; col<= 2*row-1; col++){
                    //print stars
                    System.out.print("* ");
                }
            }
            //middle rows
            else {
                //1 star
                System.out.print("* ");
                //remaining spaces= 2r-3
                for (int col= 1; col<= 2*row-3; col++){
                    System.out.print("  ");
                }
                //1 star
                System.out.print("* ");
            }
            //move to next row
            System.out.println();











        }

    }
}
