package BubbleSort;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;
                }
            }
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
