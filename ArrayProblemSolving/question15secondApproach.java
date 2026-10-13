package ArrayProblemSolving;

public class question15secondApproach {
    static void main(String[] args) {
        // bit manipulation
        int[] arr= {2,1,0,4,5};
        int n= arr.length;

        int xorSum=0;
        // xor with all the array elements
        for (int num: arr){
            xorSum = xorSum^num;
        }
        // xor with all the elements in the range
        for (int i=0; i<=n;i++){
            xorSum= xorSum^i;
        }
        //print
        System.out.println(xorSum);




    }
}
