package Array;

public class mulOfElements {
    static void main(String[] args) {

        int arr[]= {10,20,50,6,7};
        int n= arr.length;

        int mul=1;

        for (int i=0; i<= n-1; i++){
            int value = arr[i];

            mul*=value;


        }
        System.out.println(mul);




    }
}
