package Algorithms;

public class pivotIndexOfRotatedArray {
    static void main(String[] args) {
        int[] arr = {50, 60, 70, 10, 20, 30, 40};

        int s = 0;
        int e = arr.length - 1;
        int ans = 0;

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

        System.out.println(arr[ans]);

    }
}
