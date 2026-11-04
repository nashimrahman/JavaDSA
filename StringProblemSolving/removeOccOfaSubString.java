package StringProblemSolving;

public class removeOccOfaSubString {
    static void main(String[] args) {
        String s = "pqxpqypqz";
        String part = "pq";
        System.out.println(removeOccurrences(s,part));

    }
    public static String removeOccurrences(String s, String part) {
        //jab part exist krta he tab tak ye do steps karenge
        while(s.contains(part)){
            int index = s.indexOf(part);
            s = s.substring(0, index) + s.substring(index, part.length());
        }
        return s;
    }
}
