import java.util.*;

public class roughWork {

    public static void main(String[] args) {


    }

    public int firstUniqChar(String s) {
        // convert into array
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        //inserting values as key-value pair
        for (char ch : map.keySet()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int maxValue=0;
        for (int i: map.keySet()){
            int currentValue = map.get(i);
            if (currentValue> maxValue){
                //update max value
                maxValue= currentValue;
                return maxValue;
            }
        }

        return -1;
    }
}

