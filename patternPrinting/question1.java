package patternPrinting;
/*

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *

*/

public class question1 {
    static void main(String[] args) {

        int n = 5;

        for (int row= 1; row<= n ; row++){
            //for each rows -> n cols
            for (int col=1; col<= n ; col++){
                //print star
                System.out.print("* ");
            }
            // move to next line or row
            System.out.println();


        }

    }
}
