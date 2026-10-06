package collectionFramework.setInterface;

import java.util.*;

public class setDataStructure {
    static void main(String[] args) {

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

        // if i want to preserve the order and store unique values then i can use
        Set<Integer> s = new LinkedHashSet<>();

        s.add(20);
        s.add(10);
        s.add(10);
        s.add(20);
        s.add(40);
        s.add(50);
        System.out.println("LinkedHashSET: "+ s);





    }

}
