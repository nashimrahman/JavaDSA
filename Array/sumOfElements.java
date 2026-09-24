package Array;

public class sumOfElements {
    static void main(String[] args) {

        int[] arr= {10,20,50,20};
        int n= arr.length;

        int sum=0;

        for (int i=0; i<= n-1; i++){

            sum= sum+ arr[i];

        }
        System.out.println(sum);




    }


}
