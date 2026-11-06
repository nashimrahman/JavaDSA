package StringProblemSolving;

public class removeAdjacent {
    static void main(String[] args) {
        String s = "abbaca";

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            char currentCh = s.charAt(i);
            if (ans.length()>0 && ans.charAt(ans.length()-1) == currentCh) {
                ans.deleteCharAt(ans.length()-1);
            }
            else {
                ans.append(currentCh);
            }

        }

        System.out.println(ans);
    }
}
