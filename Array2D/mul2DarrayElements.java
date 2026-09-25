package Array2D;

public class mul2DarrayElements {
    static void main(String[] args) {

            int arr[][]= {
                    {1,5},
                    {2,4},

            };

            int mul=1;
            //traversing
            for (int rowIndex= 0; rowIndex<= arr.length-1; rowIndex++){
                for (int colIndex=0; colIndex<= arr[rowIndex].length-1; colIndex++){
                    //adding elements
                    int value = arr[rowIndex][colIndex];
                    mul= mul * value;
                }

            }

            //print sum
            System.out.println(mul);


        }

    }

