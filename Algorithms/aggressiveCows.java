package Algorithms;

import java.util.Arrays;

public class aggressiveCows {
 /*
    logic is -> ans ka range me binary search se mid nikalke verify kar rahe he
    with the help of helper function.
*/

    static void main(String[] args) {
        int[] arr = {1,2,4,8,9};
        System.out.println(aggressiveCows(arr,3));

    }

    public static int aggressiveCows(int[] arr, int k) {
        // code here
        //first sort the array
        Arrays.sort(arr);
        int n = arr.length;

        // binary search -> this will guess the ans
        int s = 0;
        int e = arr[n - 1] - arr[0];
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s)/2;
            if (isValid(arr, k, mid)) { // helper function will verify the mid
                // store ans
                ans = mid;
                // move right -> for best solution
                s = mid + 1;
            } else {
                // move left
                e = mid - 1;
            }
        }

        return ans;
    }

    static boolean isValid(int[] arr, int k, int mid) {

        int cowCount = 1;
        int lastPosition = 0; // first cow ko place kia

        for(int i = 1; i < arr.length; i++){ //2nd cow ko i =1 pe place kia

            if(arr[i] - arr[lastPosition] >= mid){
                cowCount++; // add new cow
                lastPosition = i;  // now calculating distance from prev cow not from the first cow

                if(cowCount ==k){
                    return true;
                }
            }
        }

        return false;
    }

}
