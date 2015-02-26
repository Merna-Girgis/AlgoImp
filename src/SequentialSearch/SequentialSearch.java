package SequentialSearch;

public class SequentialSearch {

    public void Search(int[] arr, int num) {
  
        boolean found = false;
        int i = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                found = true;
                break;
            } else {
                found = false;
            }
        }

        if (found) {
            System.out.println("It is found at position " + (i + 1));
        } else {
            System.out.println("Sorry it is not found ");
        }
    }

}
