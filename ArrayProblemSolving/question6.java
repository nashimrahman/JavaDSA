package ArrayProblemSolving;

public class question6 {
    static void main(String[] args) {
        // find the first unsorted element
        int[] arr= {1,2,5,3,7};
        System.out.println(findElement(arr));

    }

    static int findElement(int[] arr){
        int n= arr.length;
        for (int i=0; i<n ; i++){
            if (arr[i+1] < arr[i]){
                return arr[i+1];
            }
        }

        return -1;
    }



}
