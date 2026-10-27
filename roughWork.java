import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {

      String[]  ops = {"5", "-2", "4",  "C", "D", "9", "+", "+"};

      List<Integer> list = new ArrayList<>();

      for(String i: ops){
          if(i.equals("C")){
              list.remove(list.size()-1);
          } else if (i.equals("D")) {
              list.add(2* list.get(list.size()-1));
          } else if (i.equals("+")) {
              list.add(list.get(list.size()-1)+ list.get(list.size()-2));
          } else {
              list.add(Integer.parseInt(i));
          }
      }

      for (int i:list){
          
      }



    }
}