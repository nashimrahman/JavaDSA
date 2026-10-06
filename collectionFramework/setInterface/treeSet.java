package collectionFramework.setInterface;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class treeSet {
    static void main(String[] args) {
        // TreeSet -> BST -> O(logn)

        //TreeSet -> sorted unique elements
        Set<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(10);
        ts.add(50);
        ts.add(20);
        ts.add(300);
        ts.add(40);

        System.out.println(ts);



    }
}
