package Algorithms;

public class rotiParathaProblem {
    static void main(String[] args) {
        int[] ranks = {1, 2, 3, 4};
        int n = 10;
        int c = 4;
        System.out.println(minTimeToCook(ranks, n, c));
    }

    static int minTimeToCook(int[] rank, int n, int c) {

        int maxRank = 0;
        for (int i : rank) {
            if (i > maxRank) {
                maxRank = i;
            }
        }

        // searchSpace
        int s = 0;
        int e = maxRank * (n * (n + 1) / 2);
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (isValid(rank, n, mid)) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    static boolean isValid(int[] ranks, int targetParatha, int timeLimit) {
        int parathaCount = 0;  // paratha count >= target paratha

        for (int i = 0; i < ranks.length; i++) {
            int currentCookRank = ranks[i];
            int timeTaken = 0;

            // if current rank is R
            // time taken -> 1*R + 2*R + 3*R -------
            int j = 1;  // for series
            while (timeTaken <= timeLimit) {
                // means we can make paratha
                if (timeTaken + j * currentCookRank <= timeLimit) {
                    timeTaken += j * currentCookRank;
                    parathaCount++;
                    j++;
                } else {
                    // get out of this loop-> next cook
                    break;
                }
            }
        }

        return parathaCount >= targetParatha;
    }


}
