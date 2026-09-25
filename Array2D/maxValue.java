package Array2D;

public class maxValue {
    static void main() {

        int arr[][]= {
                {1,5,5},
                {2,4,5,7,},
                {1,8,},
                {1,5,7,81,1,3,5,6,9},
        };

        //let,s assume
        int maxValue= arr[0][0];
        //now traverse each element to compare assumed value
        for (int i=0; i<= arr.length-1; i++){
            for (int j=0; j<= arr[i].length-1; j++){
                if (arr[i][j]>= maxValue){
                    //then
                    maxValue= arr[i][j];
                }
            }
        }
        //print maxvalue
        System.out.println(maxValue);




    }
}
