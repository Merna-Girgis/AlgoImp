package InsertionSort;

public class InsertionSort {
    
    public void insertionSort(int[] arr){
        int low = 0;
        int high = arr.length - 1;
        
        for(int i=1;i<arr.length;i++){
            int valueToSort = arr[i];
            int j=i;
            while(j>0&&arr[j-1]>valueToSort){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=valueToSort;
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
