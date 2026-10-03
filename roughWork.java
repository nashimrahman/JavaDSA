import java.util.ArrayList;
import java.util.Scanner;

public class roughWork {

    public static String reverseString(String s) {
        int n = s.length();

        String reverse="";
        for (int i=n-1; i >=0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }

    static void main() {
        String s= "Muskan";
        System.out.println(reverseString(s));


    }














}