import java.util.ArrayList;
import java.util.Scanner;

public class roughWork {

    public static void main(String []argh) {




    }

    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n= arr.length;

        int minValue=arr[0];
        int maxValue=arr[0];
        //comparing
        for(int i=0; i<=n-1;i++){
            if(arr[i]<= minValue){
                minValue= arr[i];
            }
            else if(arr[i]>=maxValue){
                maxValue=arr[i];
            }

        }
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(minValue);
        arr2.add(maxValue);



        return arr2;
    }
}