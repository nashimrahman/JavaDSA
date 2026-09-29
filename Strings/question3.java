package Strings;

public class question3 {
    static void main() {
        //find number vowels in a word

        String str = "Tukubun";

        int count=0;
        for (int i=0; i<= str.length()-1; i++){
            char value = str.charAt(i);
            if (value =='a' || value =='e' || value =='i'|| value =='o'|| value =='u' || value =='A' || value =='E' || value =='I'|| value =='O'|| value =='U'){
                count++;
            }
        }
        System.out.println(count);






    }
}
