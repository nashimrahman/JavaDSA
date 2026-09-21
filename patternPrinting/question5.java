package patternPrinting;

/*


* * * * *
* * * *
* * *
* *
*


*/

public class question5 {
    static void main(String[] args) {

        int n = 5;
        for (int row = 1; row <= n ; row++) {
            // for each row -> var column
            // fining formula -> n-row+1 will print stars
            for (int col=1; col <= n- row + 1; col++) {
                //print star
                System.out.print("* ");
            }
            //move to next row
            System.out.println();
        }
    }
}
