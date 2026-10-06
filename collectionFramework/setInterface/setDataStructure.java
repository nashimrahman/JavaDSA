package collectionFramework.setInterface;

import java.util.*;

public class setDataStructure {
    static void main(String[] args) {

        // HashSet -> O(1)
        // to store unique value and unordered
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(44);
        System.out.println("SET: "+ set);

        set2.add(40);
        set2.add(70);
        set2.add(20);
        set2.add(42);
        set2.add(4);

        System.out.println("SET2: "+ set2);
        set.retainAll(set2); //printing all the common element from the both set
        System.out.println("SET2: "+ set2);







    }

}
