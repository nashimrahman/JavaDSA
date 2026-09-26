package Strings;

public class compareStrings {
    static void main() {
        String str = "Nasim";
        String str2 = "Nasim";
        String str3 = "nasim";


        //compare strings
        if (str == str2){
            System.out.println("True");
            //this is not the correct way to compare strings
            // == operator compares the reference
        }

        //correct way -> .equals actually compares the content(.equals is case sensitive)
        if (str.equals(str2)){
            System.out.println("This is case sensitive: "+"True");
        }
        if (str.equalsIgnoreCase(str3)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        //strings are immutable
        String s= "Muskan";
        s= "Roy";
        System.out.println(s); //if it prints Roy-> content is not changed, the reference s is set to "Roy" from "Nashim"




    }
}
