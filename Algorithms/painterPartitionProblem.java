package Algorithms;

import java.rmi.dgc.VMID;

public class painterPartitionProblem {
    static void main(String[] args) {
        int[] arr ={10,20,30,40,50};
        System.out.println(minTime(arr,3));


    }
    public static int minTime(int[] arr, int k) {
        // code here
        int sum = 0;
        for (int i: arr) {
            sum += i;
        }

        int s = 0;
        int e = sum;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s)/2;
            if (isValid(arr, k, mid)){
                ans = mid;
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }

        return ans;
    }


    // helper function -> brute force to check
    static boolean isValid(int[] arr, int k, int mid){

        int painter = 1;
        int length = 0;

        for(int i=0; i<arr.length; i++){
            if(length + arr[i] <= mid){
                length += arr[i];
            } else{
                // move to next painter
                painter++;
                // if individual length is greater than mid
                if(arr[i] > mid || painter > k){
                    return false;
                } else{
                    //
                    length = 0;
                    length += arr[i];
                }
            }
        }

        return true;
    }

}
