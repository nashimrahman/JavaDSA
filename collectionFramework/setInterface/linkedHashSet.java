package collectionFramework.setInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedHashSet {
    static void main(String[] args) {

        // LinkedHashSet -> O(n)
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
