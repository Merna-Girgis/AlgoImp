package BinarySearch;

public class BinarySearch {

    public void binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (arr[middle] == key) {
                System.out.println("It is found at position " + (middle + 1));
                break;
            } else if (arr[middle] < key) {
                low = middle + 1;
            } else{
                high = middle - 1;
            }
        }
        if (low > high) {
            System.out.println("Sorry it is not found ");
        }
        
    }

}
