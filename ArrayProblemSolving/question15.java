package ArrayProblemSolving;

public class question15 {
    static void main(String[] args) {
        //missing element
        int[] arr= {2,1,0,4,3};
        int n= arr.length;

        int rangeSum=0;
        for(int i=0; i<=n; i++){
            rangeSum+=i;
        }

        int arrSum=0;
        for(int Sum : arr){
            arrSum+= arr[Sum];
        }


        int missingElement= rangeSum-arrSum;
        System.out.println(missingElement);


    }
}
