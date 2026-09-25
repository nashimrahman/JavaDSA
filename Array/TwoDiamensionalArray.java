package Array;

public class TwoDiamensionalArray {
    static void main(String[] args) {
        //declaration
        int arr[][];
        //allocation
        arr = new int[3][4];
        //init
        int brr[][] = {
                {1,2},
                {5,7},
                {9,2},
        };



        /*

        int rowLength = brr.length;
        int colLength = brr[0].length;

        for (int row=0; row<= rowLength-1; row++){
            for (int col=0; col<= colLength-1; col++){
                System.out.print(brr[row][col]+" ");
            }
            //move to next row
            System.out.println();
        }



*/


        int rowLength = brr.length;
        for (int row=0; row<= rowLength-1; row++){
          //finding column for each row
          int colLength = brr[row].length;
          //printing column
          for (int col=0; col<= colLength-1; col++){
              System.out.print(brr[row][col]+" ");
          }
          //move to next row
          System.out.println();

      }




    }

}
