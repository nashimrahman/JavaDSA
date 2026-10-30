package Algorithms;

public class findSingleElement {
    static void main(String[] args) {
        int[] arr = {10, 10, 30, 30, 50, 60, 60};
        System.out.println(single(arr));
    }

    static int single(int[] arr) {
        // code here
        // binary search
        int s = 0;
        int e = arr.length;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // for single element
            if (mid == 0) {
                return arr[s];
            }

            int prevValue = -1;
            int nextValue = -1;
            int currentValue = arr[mid];

            if (mid - 1 >= 0) {
                prevValue = arr[mid - 1];
            }

            if (mid + 1 < arr.length) {
                nextValue = arr[mid + 1];
            }

            if (currentValue != prevValue && currentValue != nextValue) {
                return currentValue;
            }
            if (currentValue != prevValue && currentValue == nextValue) {

                if ((mid & 1) == 0) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }

            } else if (currentValue == prevValue && currentValue != nextValue) {

                if ((mid & 1) != 0) {
                    s = mid + 1;
                } else {
                    e = mid - 1;
                }
            }
        }

        return -1;
    }
}
