package Array1D;

public class maxValue {
    static void main(String[] args) {
        System.out.println("Print the maximum value of an Array");

        int[] arr= {20,7,-9,55,7,0,3};
        //length of the array
        int n= arr.length;


        //let's assume 0 index has the maxvalue
        int maxValue = arr[0];

        //comparing maxValue with each element
        for (int i=0; i<= n-1; i++){
            if (arr[i]>= maxValue){
                //then update
                maxValue= arr[i];
            }
        }
        System.out.println(maxValue);




    }
}
