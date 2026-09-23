package patternPrinting;

public class question11 {
    static void main(String[] args) {

        int n =4;

        //for upper hollow pyramid
        for (int row=1; row<= n; row++){
          //for each row -> variable column
            //part1-- front spaces
            for (int col=1; col<= n-row; col++){
                System.out.print("  ");
            }

            //part2
            if (row==1){
                System.out.print("* ");
            }
            //middle rows
            else{
                //1 star
                System.out.print("* ");
                //spaces
                for (int col=1; col<= 2*row-3; col++){
                    System.out.print("  ");
                }
                //1 star
                System.out.print("* ");
            }

            //move to next row
            System.out.println();
        }





        //lower hollow triangle
        for (int row=1; row<=n-1; row++){
            //for each row-> variable column

            //part1-- outer spaces
            for (int col=1; col<= row; col++){
                System.out.print("  ");
            }

            //part2
            //last row star
            if (row == (n-1) ){
                System.out.print("* ");
            } else {
                //1star
                System.out.print("* ");
                //spaces-> 2(n-row)-3
                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
                    System.out.print("  ");
                }
                //1star
                System.out.print("* ");
            }
            //move to next line
            System.out.println();
        }



    }
}
