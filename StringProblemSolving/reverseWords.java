package StringProblemSolving;

public class reverseWords {
    static void main(String[] args) {
        String s = "My Name Is Nashim";

        StringBuilder ans = new StringBuilder(); //faster approach
        int i = s.length() - 1;

        while (i >= 0 ) {
            // remove trailing spaces
            while (i>=0 && s.charAt(i) == ' '){
                i--;
            }
            //check the value of i
            if(i<0){
                break;
            }
            int j = i;
            // find the start index of the word
            while(j >=0 && s.charAt(j) != ' '){
                j--;
            }
            // we found space index -> now append word
            ans.append(s.substring(j+1, i+1));
            // remove unnecessary spaces
            while (j >= 0 && s.charAt(j) ==' '){
                j--;
            }
            // j< 0 means we are in the first word
            // j>=0 means space neeeded
            if(j>=0) ans.append(' ');
            // place i again
            i = j;
        }
        System.out.println(ans.toString());
    }
}
