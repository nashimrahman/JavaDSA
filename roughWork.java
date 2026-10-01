import java.util.ArrayList;
import java.util.Scanner;

public class roughWork {

    public static void reverseString(char[] s) {
        String reverse="";
        int n = s.length;
        for (int i=n-1; i >=0 ; i--){
            reverse += s[i];
        }

        System.out.println(reverse);
    }

    static void main() {
        char[] s= {'s','e','l'};
        reverseString(s);
    }














}