package ArrayProblemSolving;

import java.util.HashMap;

public class question17secondApproach {
    static void main(String[] args) {
        int[] arr= {10,5,6,7,5,3}; // ans is: 5
        // using hashMap
        HashMap<Integer, Integer> map = new HashMap<>();
        // inserting values-> in Map
        for (int key: arr){
            map.put(key, map.getOrDefault(key,0)+1);
        }

        // map is a key value pair-> values already array me present he
        // so now arr ke values ko map ke values ki key ke saath compare karo
        // map.get(value) -> to get corresponding key of that value
        int ans=0;
        for (int i: arr){
            if (map.get(i)>1){
                ans= i;
            }
        }

        System.out.println(ans);



    }
}
