package patternPrinting;
/*

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

*/

public class question6 {
    static void main(String[] args) {

        int n= 5;
        for (int row = 1; row <= n ; row++) {
            // for each row -> variable columns
            // spaces
            for (int col=1; col<= n - row; col++){
                System.out.print("  ");
            }
            //stars
            //finding the formula-> 2r-1 will print stars
            for (int col=1; col <= 2*row- 1 ; col++){
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }
    }
}
