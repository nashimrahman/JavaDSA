package Array2D;

public class theory2 {
    static void main(String[] args) {
        int arr[][]= {
                {1,5,5},
                {2,4,5,7,},
                {1,8,},
                {1,5,7,8,1,3,5,6,9},

        };

        int rowLength= arr.length;

        for (int rowIndex=0; rowIndex<= rowLength-1; rowIndex++){
            int colLength = arr[rowIndex].length;
            for (int colIndex=0; colIndex<= colLength-1; colIndex++){
                System.out.print(arr[rowIndex][colIndex]+ " ");
            }
            System.out.println();
        }


    }



}
