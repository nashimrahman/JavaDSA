package ArrayProblemSolving;

public class question16 {
    static void main(String[] args) {
        // find unique element in the array-> every element appears twice except one
        int[] arr= {1,2,3,2,3,1,4};

        int xorSum=0;
        for (int i=0; i< arr.length; i++){
            xorSum= xorSum^arr[i];
        }

        System.out.println(xorSum);
    }
}
