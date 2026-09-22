package patternPrinting;
/*


*
* *
*   *
*     *
* * * * *


*/

public class question9 {
    static void main(String[] args) {

        int n= 5;
        //controlling rows
        for (int row= 1; row<= n; row++){
            //for each row -> variable column
            for (int col=1; col<= row ; col++){
                //stars without spaces
                if (row== 1 || row == n || row == 2){
                    //print stars without spaces
                    System.out.print("* ");
                }
                //middle rows, star with spaces
                else {
                   if (col == 1){
                       //for col 1 print star
                       System.out.print("* ");

                   } else if (row == col) {
                       //for row= 3 && col =3 and row =4 && col= 4
                       System.out.print("* ");

                   }
                   //remaining spaces
                   else {
                       System.out.print("  ");
                   }




                }
            }
            //move to next row
            System.out.println();



        }

    }
}
