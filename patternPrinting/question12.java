package patternPrinting;
/*


      1
    2 2 2
  3 3 3 3 3
4 4 4 4 4 4 4



*/

public class question12 {
    static void main() {

        int n= 4;

        for (int row=1; row <= n; row++){
            //for each row-> variable column

            //part1-> print spaces
            for (int col=1; col <= n-row; col++){
                System.out.print("  ");
            }
            //part2 -> print values
            for (int col=1; col <= 2*row-1; col++){
                System.out.print(row + " ");
            }
            //move to next row
            System.out.println();

        }

    }
}
