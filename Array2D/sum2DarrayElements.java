package Array2D;

public class sum2DarrayElements {

    static void main(String[] args) {

        int arr[][]= {
                {1,5,5},
                {2,4,5,7,},
                {1,8,},
                {1,5,7,8,1,3,5,6,9},
        };

        int sum=0;
        //traversing
        for (int rowIndex= 0; rowIndex<= arr.length-1; rowIndex++){
            for (int colIndex=0; colIndex<= arr[rowIndex].length-1; colIndex++){
                //adding elements
                int value = arr[rowIndex][colIndex];
                sum+= value;
            }
            //move to next row
            System.out.println();
        }

        //print sum
        System.out.println(sum);


    }
}
