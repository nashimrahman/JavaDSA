package ArrayProblemSolving;

import java.util.HashSet;
import java.util.Set;

public class leetCode217 {
    public static void main(String[] args) {
        int[] arr= {3,6,8,9,9};
        System.out.println(containsDuplicate(arr));



    }
    public static boolean containsDuplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= arr.length - 1; i++) {
            // agar set ke andar add nhi krpao toh duplicate element heee
            if (!set.add(arr[i])) {
                return true;
            }
        }

        return false;
    }
}
