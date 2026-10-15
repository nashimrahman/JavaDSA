import javax.swing.*;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {
        int[] nums= {5,1};

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int n = nums.length;

        //finding range
        for(int put: nums){
            list.add(put);
        }
        Collections.sort(list);

        for (int i= list.getFirst(); i<= list.getLast(); i++){
            list2.add(i);
        }

        for (int j=0; j< list.size(); j++){
            if (list2.contains(list.get(j))){
                list2.remove(list.get(j));
            }
        }

        System.out.println(list2);



    }
}

