package BasicMaths;

public class leetCode1295 {
    static void main(String[] args) {
        //Find Numbers with Even Number of Digits
//        Input: nums = [12,345,2,6,7896]
//        Output: 2

        int[] arr= {12, 345, 2, 6, 7896};
        int count=0;

        for (int i=0; i< arr.length; i++){
            // this is the condition to get no of digits in each index
            int digit = (int)Math.log10(arr[i])+1;
            if((digit&1)==0){
                count++;
            }

        }
        System.out.println(count);
    }
}
