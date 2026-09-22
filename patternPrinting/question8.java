package patternPrinting;

public class question8 {
    static void main(String[] args) {

        //rows
        int n = 4;
        //To control rows
        for(int row=1; row<= n; row++){
            //for each row -> 6 columns
            //full stars
            for (int col=1; col<= 6 ; col++){

                if(row == 1 || row==n){
                    System.out.print("* ");
                } else {
                    //for middle rows
                    if(col==1 || col==6 ){
                        //print star
                        System.out.print("* ");
                    }
                    // remaining spaces
                    else {
                        System.out.print("  ");
                    }
                }
            }
            //move to the next row
            System.out.println();
        }
    }
}
