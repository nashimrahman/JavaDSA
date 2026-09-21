package patternPrinting;

/*


* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *


*/


public class question7 {
    static void main(String[] args) {

        int n = 5;
        // controlling rows
        for(int row=1; row<= n; row++){
            // for each row-> variable column
            //spaces
            for (int col=1; col<= row-1; col++){
                //printing spaces
                System.out.print("  ");
            }
            //stars
         /*
            after finding formula 2n-row-space
                                 =2n-row-[row-1]
                                 =2n-2row+1

         */
            for (int col=1; col<= 2*n- 2*row+1 ; col++){
                //printing stars
                System.out.print("* ");
            }
            //move to next row
            System.out.println();


        }
    }
}
