import javax.swing.*;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {

        int[] nums = {2,1,4,5};
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        if(Arrays.equals(arr, nums)){
            System.out.println("True");
        }
        else{
            System.out.println(" false");
        }
    }
}

