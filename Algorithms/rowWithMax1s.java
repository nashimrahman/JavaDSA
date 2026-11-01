package Algorithms;

public class rowWithMax1s {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1},
                {0, 0, 1, 1, 1},
        };
        System.out.println(max1s(matrix));

    }

    static int max1s(int[][] arr) {

        int n = arr.length;    // rowLength
        int m = arr[0].length; // colLength
        int maxCount = -1;
        int maxCountIndex = -1;


        //traversing in each row
        for (int i = 0; i < n; i++) {
            // binarySearch
            int s = 0;
            int e = m - 1;
            int indexOfFirstOcc = -1;
            int count;

            //if there is no 1 in the array -> count will be 0
            if(arr[i][e] == 0){
                indexOfFirstOcc = m;
            }
            // there exist 1s -> binary search
            else {
                //finding the first occ
                while (s <= e) {
                    int mid = s + (e - s) / 2;
                    if (arr[i][mid] == 1) {
                        indexOfFirstOcc = mid;       //store indexOfFirstOcc
                        e = mid - 1;
                    } else {
                        s = mid + 1;
                    }
                }
            }

            //count 1s
            count = m - indexOfFirstOcc;
            if(count > maxCount){
                maxCount = count;
                maxCountIndex = i;
            }

            //move to next row
        }

        return maxCountIndex;
    }
}
