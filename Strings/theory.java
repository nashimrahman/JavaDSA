package Strings;

import java.util.Scanner;

public class theory {
    static void main() {
        Scanner sc= new Scanner(System.in);
        //string is not a primitive datatype-> it is an object of String class, that's why is has methods

        //creating a string using string literal->stores string pool
        String str= "Nashim";
        System.out.println(str);
        String str2= "Nashim";
        System.out.println(str2);
        String str3= "nashim";
        //creating s string using new keyword
        String str4= new String("Nashim");
        System.out.println(str4);


        //str2 does not create a space for "Nashim" ->
        //just because the string is same, str2 only stores the reference in stack


        //length of a string
        System.out.println(str.length());


        //access characters -> Note: it is not an array
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));

        //traverse
        for (int i =0; i<= str.length()-1; i++){
            System.out.print(str.charAt(i));
        }

        //taking input
        String name= sc.next(); // stores the first word
        String name2= sc.nextLine(); // store the whole line








    }
}
