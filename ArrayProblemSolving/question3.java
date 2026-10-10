package ArrayProblemSolving;

public class question3 {
    static void main(String[] args) {
        // search for an element in an array-> linear search
        int[] arr= {8,4,6,9};
        System.out.println(getElement(arr, 4));

    }

    static int getElement(int[] arr, int target){
        int n = arr.length;

        for (int i=0; i< n; i++){
            if (arr[i] == target){
                return i;
            }
        }

        return -1;
    }




}
