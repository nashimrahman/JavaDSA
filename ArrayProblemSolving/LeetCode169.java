package ArrayProblemSolving;

import java.util.*;


public class LeetCode169 {
    static void main(String[] args) {
       String s= "abccbaacz";
        System.out.println(repeatedCharacter(s));
    }

    public static char repeatedCharacter(String s) {
        char[] arr = s.toCharArray();
        int n= arr.length;
        HashMap<Character, Integer> map = new HashMap<>();

       for (int i=0; i<n; i++){
           for (int j=i+1; j<n; j++) {
               if (arr[i] == arr[j]) {
                   map.put(arr[j], j);
               }
           }
       }
        System.out.println(map.keySet());
        System.out.println(map.values());

       return 0;
    }
}
