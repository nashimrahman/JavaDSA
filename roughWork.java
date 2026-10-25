import java.util.*;

public class roughWork {
    public static void main(String[] args) {
       String s = "leeeetcode";
        char[] ch = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 1;
        int count= 0;
        while (j<ch.length){

            if(ch[i] != ch[j]){
                i++;
                j++;
            } else if (ch[i] == ch[j]) {
                count++;
                j++;
            }
            list.add(count);
        }

        System.out.println(list);

    }
}

