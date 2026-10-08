package collectionFramework.useOfComparator;

import java.util.Arrays;

public class main {
    static void main(String[] args) {

        Integer[] arr= {9,4,7,2,8,6,1};
        // default -> asc order sorting
        Arrays.sort(arr, new desSorting());
        for (int a : arr){
            System.out.print(a+" ");
        }



    }
}
