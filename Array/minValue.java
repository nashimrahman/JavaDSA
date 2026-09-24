package Array;

public class minValue {
    static void main(String[] args) {

        int[] arr= {20,7,-9,55,7,0,3};
        int n = arr.length;

        //let's assume arr[0] has the minimum value
        int minValue= arr[0];
        //now comparing each value with minValue
        for (int i=0; i<= n-1; i++){
            if (arr[i] <= minValue){
                //update
                minValue= arr[i];

            }

        }

        System.out.println(minValue);


    }
}
