
package Algorithms;

class InfiniteArray {
    private int[] arr;
    public InfiniteArray(int[] nums) {
        this.arr = nums;
    }
    public int get(int index) {
        if (index >= arr.length)
            return Integer.MAX_VALUE;

        return arr[index];
    }
}

public class exponentialSearch {
    static int unboundedSearch(InfiniteArray arr, int target) {

        if (arr.get(0) == target) {
            return 0;
        }

        // Find the range
        int i = 1;
        while (arr.get(i) < target) {
            i = i * 2;
        }

        // Binary Search in the identified range
        int s = i / 2;
        int e = i;

        while (s <= e) {

            int mid = s + (e - s) / 2;
            if (arr.get(mid) == target) {
                return mid;
            }
            else if (arr.get(mid) > target) {
                e = mid - 1; // left
            }
            else {
                s = mid + 1; // right
            }
        }

        return -1;
    }
}
