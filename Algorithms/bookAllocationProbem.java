package Algorithms;

public class bookAllocationProbem {
    public int findPages(int[] arr, int k) {

        // no of book must be greater than k
        if (arr.length < k) {
            return -1;
        }

        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        // binary search
        int s = 1;
        int e = sum;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (isValidAnswer(arr, k, mid)) {  //helper function
                // true
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    static boolean isValidAnswer(int[] arr, int k, int mid) {
        int student = 1;
        int pagesSum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (pagesSum + arr[i] <= mid) {
                // store sum
                // page is in the limit
                pagesSum += arr[i];
            } else {

                // current student ko aur book ni milega
                // go to next student
                student++;

                // some base cases
                // agar individual book ka total page hi mid se bada ho jaye to
                if (arr[i] > mid || student > k) {
                    return false;

                } else {
                    // can assign to new student
                    // reset sum
                    pagesSum = 0;
                    pagesSum += arr[i];

                }
            }
        }

        return true;
    }

}

