import java.util.*;

public class roughWork {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // array length
        int n = arr.length;
        int mul=0;
        for (int i = 0; i < n; i++) {
            mul = mul*10+arr[i];
        }
        mul += 1;
        System.out.println(mul);

//        // now removing digits then add
//        int[] newArr = new int[n + 1];
//        int index = n;
//        while (sum != 0) {
//            //taking out digits
//            int digit = sum % 10;
//            // adding digits in new array
//            newArr[index] = digit;
//            //removing digits
//            sum /= 10;
//            index--;
//        }


    }
}

