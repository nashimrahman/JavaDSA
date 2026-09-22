package patternPrinting;

public class repeatQuestion9 {
    static void main(String[] args) {

        int n= 10;
        //controlling rows
        for (int row= 1; row<= n; row++){
            //for solid stars
            if (row== n || row == 2|| row== 1){
                for (int col=1; col<= row; col++){
                    System.out.print("* ");
                }

            }
            //middle rows
            else {
                // 1 star
                System.out.print("* ");
                // spaces= row-2
                for (int col=1; col<= row-2; col++){
                    System.out.print("  ");
                }
                //1 star
                System.out.print("* ");
            }
            //move to next row
            System.out.println();









        }









    }
}
