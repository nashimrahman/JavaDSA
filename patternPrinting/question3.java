package patternPrinting;

/*

*
* *
* * *
* * * *
* * * * *

*/

public class question3 {
    static void main(String[] args) {

        int n = 5;

        for (int row = 1; row<= n; row++){

            //for each row-> variable columns
            for (int col= 1; col<= row; col++){
            //print star
                System.out.print("* ");
            }
            //move to next row
            System.out.println();


        }
    }
}
