package Strings;

public class concatStrings {
    static void main() {
        String str= "Nasim";


        //length of string
        System.out.println(str.length());


        //concat string
        System.out.println(str.concat(" Rahman")); //concat creates a new string and stores "Nashim Rahman"


        //correct way concat strings
        str = str.concat(" Rahman");
        System.out.println(str);
        System.out.println("Length after concat: "+str.length());
        //now the string length becomes 13 from 6




    }
}
