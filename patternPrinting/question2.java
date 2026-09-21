package patternPrinting;


/*

 * * * * *
 * * * * *
 * * * * *

 */

public class question2 {
    static void main(String[] args) {

        int n = 3;
        for (int row=  1; row <= n ; row++){
            // for each row -> cols
            for (int col = 1; col <= 4; col++){
                //print star
                System.out.print("* ");
            }
            //move to next row
            System.out.println();

        }


    }
}
