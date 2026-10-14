package ArrayProblemSolving;

import java.util.HashMap;

public class question12 {
    static void main(String[] args) {
        // find mode of an array -> frequency
        int[] arr = {1, 1, 1, 1, 3, 3, 2, 2, 2,2,2,2,2,2,2, 5, 5, 5};
        System.out.println(getMode(arr)); // ans is: 2

    }

    static int getMode(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int value : arr) {
            // inserting values
            // -> if value is present then -> value+1
            // -> and if value does not present -> 0+1
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        // let max value=0 -> frequency
        int maxValue = 0;
        // let key of the max value =0 -> key
        int maxValueKey=0;

        for (int i : map.keySet()) {
            int currentKey = i;
            int currentKeyValue = map.get(i);

            if (currentKeyValue > maxValue) {
                maxValue = currentKeyValue;
                maxValueKey = currentKey;
            }
        }


        return maxValueKey;
    }


}
