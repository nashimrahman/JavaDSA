package Algorithms.BSonAnswers;

public class sqrtXwithPrecision {
    static void main(String[] args) {
        System.out.println(sqrtOfX(56));
    }

    static double sqrtOfX(int n) {
        int s = 1;
        int e = n;
        double ans = -1;

        if (n == 0) {
            return 0;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid == n / mid) {
                return mid;

            } else if (mid > n / mid) {
                // move left
                e = mid - 1;
            } else {
                // move right
                ans = mid;
                s = mid + 1;
            }
        }


        // with precision
        double factor = 1;
        int totalPrecision = 3;

        for (int round = 1; round <= totalPrecision; round++) { // rounds
            factor /= 10;
            for (int i = 1; i < 10; i++) { // this loop calculating -> 7.1, 7.2, 7.3,...., 7.9
                double newAns = ans + factor;

                if (newAns * newAns == n) {
                    return newAns;
                } else if (newAns * newAns < n) {
                    ans = newAns;
                } else {
                    break;
                }
            }
        }


        return Math.round(ans * 1000.0) / 1000.0;

    }

}
