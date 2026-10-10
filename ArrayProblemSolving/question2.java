package ArrayProblemSolving;

public class question2 {
    static void main(String[] args) {
        // multiply each array element by 10
        int[] arr= {8,4,6,9};
        int[] ans = multiply(arr);

        for (int i : ans){
            System.out.print(i+ " ");
        }

    }

    static int[] multiply(int[] arr){

        int n = arr.length;
        int[] newArr = new int[n];

        for (int i=0; i<n ;i++){
            newArr[i] = arr[i]*10;
        }

        return newArr;
    }






}
