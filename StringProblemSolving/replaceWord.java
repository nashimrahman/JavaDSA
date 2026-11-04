package StringProblemSolving;

public class replaceWord {
    static void main(String[] args) {
        String Str = "LIELIEILIEAMLIECOOL";
        String Sub = "LIE";
        System.out.println(extractSecretMessage(Str, Sub));

    }
    static String extractSecretMessage(String Str, String Sub) {
        // Replacing all occurrences of
        // Sub in Str by empty spaces
        Str = Str.replaceAll(Sub, " ");

        // Removing unwanted spaces in the
        // start and end of the string
        Str = Str.trim();

        return Str;
    }

}
