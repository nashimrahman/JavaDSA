package Algorithms;

public class sortingAlgorithms {
    static void main(String[] args) {
        int[] arr = {6, 3, 4, 9, 1, 7};
        insertionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }


    }

    static void bubbleSort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // rounds
            for (int j = 0; j < n - i - 1; j++) {   // neighbouring elements comparison
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {   // for rounds
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {    // for finding minvalue
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // after finding min -> swap
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }


    }

    static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = i;
            int prev = i - 1;
            int currentValue = arr[current];

            while (prev>=0 && currentValue < arr[prev]) {
                // shifting
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //place currentValue
            arr[prev + 1] = currentValue;
        }

    }


}
