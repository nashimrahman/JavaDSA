import java.util.ArrayList;
import java.util.Scanner;

public class roughWork {

    public static boolean containsDuplicate(int[] nums) {
        int n= nums.length;


        for (int i=0; i<= n-1; i++){
           for (int j=i+1; j<= n-1; j++){
               if (nums[i] == nums[j]){
                   return true;
               }

           }



        }

        return false ;
    }

    static void main() {

        int[]  arr= {1,1,2,3,4};
        System.out.println(containsDuplicate(arr));
    }















}