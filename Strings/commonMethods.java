package Strings;

public class commonMethods {
    static void main() {
        // charAt() -> returns the character by indexing
        String str= "Muskan";
        System.out.println(str.length());
        System.out.println(str.charAt(0));

        // equals() -> compare strings
        String str2= "muskan";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));

        // isBlank() -> returns true is it does not contain anything
        String str3 = "  ";
        System.out.println(str3.length());
        System.out.println(str3.isBlank());
        System.out.println(str3.isEmpty());

        // trim() -> removes the leading and trailing spaces
        String str4 = "   Tuku     ";
        System.out.println(str4);
        String value = str4.trim();
        System.out.println(value);

        // toUpperCase()
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        // substring()
        String str5 = "My name is muskan";
        System.out.println(str5.substring(0,5));

        // contains()
        String str6 = "My name is muskan";
        System.out.println(str6.contains("muskan"));

        // valueOf()
        int num = 87484;
        String str7 = String.valueOf(num);
        System.out.println(str7);
        System.out.println(str7+5);

        // startsWith()
        String str8 = "My name is muskan";
        System.out.println(str8.startsWith("My"));
        System.out.println(str8.endsWith("an"));

        // toCharArray() -> converts the string to char array
        String str9 ="Muskan";
        char[] arr = str9.toCharArray();

        for (int i=0; i<= arr.length-1; i++){
            System.out.print(arr[i]);
        }
        System.out.println();

        //using forEach loop
        for (char ss : arr){
            System.out.print(ss);
        }

        // split() ->
        String input = ",My,name,is,muskan";
        String[] words = input.split(",");
        for (String str10 : words){
            System.out.println(str10);
        }

        // replace()
        String str11 ="Nashim";
        System.out.println(str11.replace("N","M"));

    }
}
