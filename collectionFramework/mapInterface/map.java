package collectionFramework.mapInterface;

import java.util.*;

public class map {
    static void main(String[] args) {
        // key value pairs
        Map<String, String> map = new HashMap<>();

//        Map<String, String> map = new LinkedHashMap<>(); to preserve the order -> O(n)
//        Map<String, String> map = new TreeMap<>();   sorted -> O(logn)


        map.put("in", "India");
        map.put("in", "India2");
        map.put("es", "Spain");
        map.put("en", "England");
        map.put("us", "United States");
        System.out.println(map);

        // new map
        Map<String, String> map2 = new HashMap<>();

        // inserting value
        map2.put("br", "Brazil");
        System.out.println("Before: "+ map2);
        // putAll() -> combines both maps
        map2.putAll(map);
        System.out.println("After: "+ map2);
        // size()
        System.out.println(map2.size());

        // put if absent
        map2.putIfAbsent("is", "India3");
        System.out.println(map2);
        System.out.println(map2.size());

        // get or default -> if the key is absent then print NONE
        System.out.println(map2.getOrDefault("inn", "NONE"));
        // containsKey() -> return boolean value
        System.out.println(map2.containsKey("in"));
        // containsValue()
        System.out.println(map2.containsValue("India2"));

        //replace() -> it changes the corresponding value of the key
        map2.replace("in", "Indonesia");
        System.out.println(map2); // observe the output

        // keySet() -> returns the key set
        System.out.println(map2.keySet());

        // we can store the keySet as well
        Set<String> key = map2.keySet();
        System.out.println(key);

        // we can store the valueSet using values() -> this method is not available in SET
        Collection<String> valueSet = map2.values();
        System.out.println(valueSet);

        // get all entry set from map
        Set<Map.Entry<String, String>> entryset= map2.entrySet();
        System.out.println("Entry SET: "+entryset);





    }
}
