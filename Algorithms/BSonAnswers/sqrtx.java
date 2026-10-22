package Algorithms.BSonAnswers;

public class sqrtx {

    static void main(String[] args) {
        // find under root
        System.out.println(sqrtOfX(16));
    }

    static int sqrtOfX(int n){
        int s = 1;
        int e = n;
        int ans = -1;

        if(n == 0){
            return 0;
        }

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (mid == n/mid) {
                return mid;

            } else if (mid > n/mid) {
                // move left
                e = mid - 1;
            } else {
                // move right
                ans = mid;
                s = mid + 1;
            }
        }

        return ans;
    }

}
