package Algorithms;

public class pivotIndexOfRotatedArray {
    static void main(String[] args) {
        // find pivot index of a roated sorted array
        int[] arr = {50, 60, 70, 10, 20, 30, 40};
        System.out.println(findPivotIndex(arr));


    }

    static int findPivotIndex(int[] arr){
        int s = 0;
        int e = arr.length - 1;
        int ans = 0;

        // if s is less than e -> means no rotation
        if(arr[s] <= arr[e]){
            return -1;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;
            //agar mid, end se chota he to L2 me he -> move to L1
            if (arr[mid] <= arr[arr.length - 1]) {
                e = mid - 1;
            } else {
                // arr[mid] > arr[e]
                ans = mid;
                s = mid + 1;
            }

        }
     return ans;
    }
}
