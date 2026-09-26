package Strings;

import jdk.jshell.EvalException;

public class question4 {
    static void main() {
        //Q. reverse a String

        String name ="Muskan";

        // method call
        System.out.println(reverseString(name));


    }

    static String reverseString(String name){

        //finding the length of string
        int n= name.length();

        String reverse="";
        for (int i= n-1; i >= 0 ; i--){
            reverse = reverse + name.charAt(i);
        }
        //print
        System.out.println(reverse);

        return reverse;
    }
}
