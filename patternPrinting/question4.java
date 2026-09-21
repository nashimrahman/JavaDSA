package patternPrinting;
/*

        * * * * *
      * * * * *
    * * * * *
  * * * * *
* * * * *


*/


public class question4 {
    static void main(String[] args) {

        int n = 5;
        for(int row= 1; row <= n; row++){
            // for each row ->

            // spaces
            for (int col= 1; col <= n- row; col++){
                // print space
                System.out.print(" ");
            }
            // stars
            for (int col= 1; col <= n; col++){
                //print star
                System.out.print("* ");
            }
            //move to next row
            System.out.println();


        }


    }
}
