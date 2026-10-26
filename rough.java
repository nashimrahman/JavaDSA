public class rough {
    static void main(String[] args) {
        int i =10;
        int sum = 0;
        while(i !=0 ) {
            int digit = i % 10;
            sum += digit;
            i /= 10;

        }

        System.out.println(sum);
    }
}
