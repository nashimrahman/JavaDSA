package collectionFramework.mapInterface;

import java.util.*;

public class map {
    static void main(String[] args) {
        // key value pairs
        Map<String, String> map = new HashMap<>();

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





    }
}
