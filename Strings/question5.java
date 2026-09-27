package Strings;

public class question5 {
    static void main(String[] args) {
        String str = "BOOB";
        //send str to the method -> method calling
        System.out.println(isPalindrome(str));


    }

    static String reverseString(String name){

        //finding the string length
        int n= name.length();

        String reverse ="";
        for (int i=n-1; i>=0; i-- ){
            reverse += name.charAt(i);
        }
        return reverse;
    }

    static boolean isPalindrome(String pal){
        String originalString = pal;
        String reverseString = reverseString(pal);
        if (originalString.equals(reverseString)){
            return true;
        }

        return false;
    }





}
