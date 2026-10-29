import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {
        String[] words = {"leet", "code"};
        char x = 'e';

        List<Integer> list = new ArrayList<>();

        for(int i=0; i < words.length; i++){
            for(int j=0; j<words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(ch ==x){
                    list.add(i);
                    break;
                }
            }
        }

        System.out.println(list);



    }
}
