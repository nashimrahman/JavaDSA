package ArrayProblemSolving;

public class LeetCode27 {
    static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};
        int val = 3;
        System.out.println(removeElement(nums, val));


    }

    public static int removeElement(int[] arr, int val) {
        int n = arr.length;
        // two pointer
        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if (arr[j] == val) {
                j--;
            } else if (arr[i] != val) {
                i++;
            } else if (arr[i] == val) {
                // exchange
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                // move pointers
                i++;
                j--;
            }
        }

        return i;

    }
}
