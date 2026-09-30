package BasicMaths;

public class question11 {
    static boolean isPerfect(int num){
        int sum=1;
        for (int i=2; i*i<= num; i++){
            if (num%i==0){
                //finding firstFactor
                int firstFactor = i;
                System.out.println(firstFactor);
                //finding secondFactor
                int secondFactor = num/i;
                // sum the factors
                sum += firstFactor+ secondFactor;
            }
        }
        System.out.println("Sum: "+sum);

        return sum == num;
    }

    static void main() {
        System.out.println(isPerfect(6));

    }


}
