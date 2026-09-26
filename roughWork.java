import java.util.Scanner;

public class roughWork {
    static void main(String[] args) {

        int arr[] = {2, 7, 8, 6, 1};

        int maxValue= arr[0];
        int secondLargest = arr[0];

        for (int i=0; i<= arr.length-1; i++){
            //find the maximum value
            if (arr[i] >= maxValue){
                maxValue= arr[i];
            }

            else if (arr[i] > secondLargest && arr[i] != maxValue ){
                secondLargest = arr[i];
            }

        }
        //print
        System.out.println(secondLargest);

    }




}