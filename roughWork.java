import java.sql.ClientInfoStatus;
import java.util.*;

public class roughWork {
    public static void main(String[] args) {
        int highLimit = 15;
        int lowLimit = 5;

        int noOfBalls = highLimit - lowLimit + 1;

        List<Integer> balls = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        // making balls
        for (int i = lowLimit; i <= highLimit; i++) {
            int num = i;
            int sum = 0;
            while (num != 0) {
                int digit = num % 10;
                sum += digit;
                num /= 10;
            }
            balls.add(sum);
        }

        // freq
        for(int key : balls){
            map.put(key, map.getOrDefault(key,0)+1);
        }
        // finding max value
        for(int i: map.keySet()){

        }

        System.out.println(map.keySet());
        System.out.println(map.values());


    }

}