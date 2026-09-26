package Strings;

public class question1 {
    static void main() {
        //print each character of the string

        String str = "My name is Nashim";

        for (int i=0; i<str.length()-1; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }

        char[] ch = str.toCharArray();
        int l =ch.length;
        System.out.println(l);




    }
}
