package Algorithms;

public class findPeakofMountain {
    static void main(String[] args) {
        //find max value in the array using B.S
        int[] arr = {10, 20, 35, 40, 77, 65, 35};


        // binary search
        int start = 0;
        int end = arr.length - 1;

        int ans=0;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                //move start to mid+1
                start = mid + 1;
            } else {
                // arr[mid] >= arr[mid + 1]
                ans = mid;
                end = mid - 1;

            }
        }

        System.out.println(arr[ans]);
    }
}
