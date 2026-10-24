import java.util.*;

public class roughWork {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};

       int position = 3;
       for(int ii=0; ii< position;ii++){
           int temp = arr[arr.length-1];
           for(int i= arr.length-1; i>=1; i--){
               arr[i] = arr[i-1];
           }
           arr[0] = temp;
       }

       for (int i:arr){
           System.out.print(i);
       }



    }
}

