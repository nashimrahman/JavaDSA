package Array;

public class theory {
    static void main(String[] args) {
        //declaration
        int arr[];
        //allocation
        arr= new int[5];
        //init
        int brr[]={2,7,8,9};

        int n= brr.length;

        //for each loop-> print all the int value of brr array which is stored in var variable
        for (int var : brr){
            System.out.println(var);
        }



/*

        for (int index=0; index < n ; index++) {
            //print index
            System.out.println(brr[index]);

        }
*/




    }
}
