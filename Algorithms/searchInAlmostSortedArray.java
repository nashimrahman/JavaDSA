package Algorithms;

public class searchInAlmostSortedArray {
    static void main(String[] args) {
        int[] arr = {10, 30, 20, 50, 40, 70, 60, 80};
        int n= 30;
        System.out.println(search(arr, n));

    }

    static int search(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;


            if (mid - 1 >= 0 && arr[mid - 1] == target)
                return mid - 1;

            if (arr[mid] == target)
                return mid;

            if (mid + 1 < arr.length && arr[mid + 1] == target)
                return mid + 1;

            if (target > arr[mid]) {
                s = mid + 2; //move right
            } else {
                e = mid - 2; // move left
            }
        }

        return -1;

    }
}
