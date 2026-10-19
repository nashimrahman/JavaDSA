package Algorithms;

public class BinarySearch {
    static void main(String[] args) {
        // only applicable to sorted array
        int[] arr = {1, 3, 5, 10, 33, 44, 47, 50, 60, 80, 88};
        System.out.println(binarySearch(arr, 10));

    }

    static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;

        int start = 0;
        int end = n - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                // go to right side
                start = mid + 1;
            } else {
                // go to left side
                end = mid - 1;
            }
            // updating mid
            mid = start + (end - start) / 2;
        }

        // if execution reaches this position means element is not in the array
        return false;
    }
}
