package Algorithms;

public class SearchInSortedRotatedArray {
    static void main(String[] args) {
        int[] arr = {50, 60, 70, 10, 20, 30, 40};

        int target = 70;  // we have to return the index of 20
        int pivotIndex = findPivotIndex(arr);
        System.out.println(arr[pivotIndex]);

        int startIndexL1 = 0;
        int endIndexL1 = pivotIndex;
        if(target>= arr[startIndexL1] && target <= arr[endIndexL1]){
            int ans= binarySearch(arr, startIndexL1, endIndexL1, target);
            System.out.println(ans);
        }


        int startIndexL2 = pivotIndex + 1;
        int endIndexL2 = arr.length - 1;
        if( target >= arr[startIndexL2] && target<= arr[endIndexL2] ){
            int ans = binarySearch(arr, startIndexL2, endIndexL2, target);
            System.out.println(ans);
        }




    }

    static int binarySearch(int[] arr, int s, int e, int target) {

        s = 0;
        e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;


        }

        return -1;
    }

    static int findPivotIndex(int[] arr) {
        // find the pivot index
        int s = 0;
        int e = arr.length - 1;
        int pivotIndex = 0;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= arr[arr.length - 1]) {
                // move to L1
                e = mid - 1;
            } else {
                pivotIndex = mid;
                s = mid + 1;
            }
        }
        // range of L1 -> 0 to pivotIndex
        // range of L2 -> pivotIndex+1 to end
        return pivotIndex;
    }
}
