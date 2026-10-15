package ArrayProblemSolving;

public class LeetCode26 {
    // LeetCode 26
    static void main(String[] args) {
    int[] arr = {1,2,2,3,3,4};
    int n = arr.length;

    // two pointer
       int i=0;
       int j= i+1;

       while( j<n ){
           // unique element
           if(arr[i] != arr[j]){
               i++;
               arr[i]= arr[j];
               j++;
           }
           // same element
           else if(arr[i] == arr[j]){
               j++;
           }

       }

       // print
       for (int ans : arr){
           System.out.print(ans);
       }



    }
}
