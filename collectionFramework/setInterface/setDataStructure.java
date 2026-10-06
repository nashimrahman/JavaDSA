package collectionFramework.setInterface;

import java.util.*;

public class setDataStructure {
    static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        Set<Integer> list = new HashSet<>();
        Set<Integer> list2 = new HashSet<>();

        for(int i=0; i<= nums1.length-1; i++){
            list.add(nums1[i]);
        }

        for(int i=0; i<= nums2.length-1; i++){
            list2.add(nums2[i]);
        }

        list.retainAll(list2);

        list.toArray();
        System.out.println(list);





    }

}
