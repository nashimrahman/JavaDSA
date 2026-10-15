package ArrayProblemSolving;

import java.util.ArrayList;
import java.util.List;

public class question18 {
    static void main(String[] args) {
        // missing element from an array with duplicates -> See Notes

//        Given an array nums containing n integers where some elements may be duplicated
//        and the integers are supposed to be in the range 1 to n, your task is to return
//        the list of integers that are missing from the Array. The size of the array is n,
//        and each integer in the array is between 1 and n inclusive

        List<Integer> list = new ArrayList<>();

        int[] arr= {1,4,4,5,2,2};
        int n= arr.length;

        for (int index=0; index<n; index++){
            // getting the value
            int value= Math.abs(arr[index]);
            // ideal positon of the value
            int idealPosition = value-1;
            // marking the values with -ve sign to avoid value lost
            if (arr[idealPosition]>0){
                // make the value negative
                arr[idealPosition]= -arr[idealPosition];
            }
        }
        // travel the array-> whenever get the +ve value print the expected value
        for (int i=0; i<n; i++){
            if (arr[i]>0){
                int valueAtThisIndex= i+1;
                list.add(valueAtThisIndex);
            }
        }

        System.out.println(list);



    }
}
