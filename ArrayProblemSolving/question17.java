package ArrayProblemSolving;

public class question17 {
    static void main(String[] args) {
        // find the first repeating element in an array
        int[] arr= {10,5,6,7,5,3}; // ans is: 5
        int n= arr.length;

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }

        }




    }
}
