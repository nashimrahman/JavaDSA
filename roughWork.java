import javax.swing.*;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int pivotIndex = findPivotIndex(nums); // index =3
        System.out.println(pivotIndex);
//        if( pivotIndex ==0){
//
//        }

//        int startL1 = 0;
//        int endL1 = pivotIndex;
//
//
//        int startL2 = pivotIndex + 1;
//        int endL2 = nums.length-1;
//
//        if( target>= nums[startL1] && target<= nums[endL1]) {
//            int ans = binarySearch(nums, startL1, endL1, target);
//            System.out.println(ans);
//        } else if(target>= nums[startL2] && target<= nums[endL2]) {
//            int ans = binarySearch(nums, startL2, endL2, target);
//            System.out.println(ans);
//        }


    }

    static int binarySearch(int[] arr, int s, int e, int target) {

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1; // if element is not present
    }

    static int findPivotIndex(int[] arr) {
        int n = arr.length;

        int s = 0;
        int e = n - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] <= n - 1) {
                // move to L1
                e = mid - 1;
            } else {
                // you are in L1
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }
}

