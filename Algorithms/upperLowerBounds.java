package Algorithms;

public class upperLowerBounds {
    static void main(String[] args) {

        int[] arr = {10, 20, 30, 30, 30, 40, 40, 40, 70};
        int lowerBound = findLowerBound(arr, 40);
        int upperBound = findUpperBound(arr, 40);

        System.out.println(lowerBound);
        System.out.println(upperBound);

    }

    static int findUpperBound(int[] arr, int target) {
        int n = arr.length;

        int s = 0;
        int e = n - 1;
        int ans = 0;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                // move right
                s = mid + 1;
            } else {
                // move left
                ans = mid;
                e = mid - 1;
            }

        }

        return ans;
    }

    static int findLowerBound(int[] arr, int target) {
        int n = arr.length;

        int s = 0;
        int e = n - 1;
        int ans = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                // move to left
                ans = mid;
                e = mid - 1;
            } else {
                // move to right
                s = mid + 1;
            }
        }
        return ans;
    }
}

