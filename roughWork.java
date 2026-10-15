import javax.swing.*;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {

        int n = 2;
        int[] arr = new int[n + 1];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            int count = 0;
            int v= i;
            while (v != 0) {
                if ((v & 1) != 0) {
                    count++;
                }
                //right shift to remove the bit
                v = v >> 1;
            }
            arr[i] = count;
        }

        for (int ans: arr){
            System.out.print(ans);
        }

    }
}

