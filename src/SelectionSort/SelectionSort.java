package Selectionsort;

public class SelectionSort {

    public void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minPos]) {
                    minPos = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;

        }
        printArray(arr);
        System.out.println();
    }

    public void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + ", ");
        }
    }

}
