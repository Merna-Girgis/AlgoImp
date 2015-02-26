package algoimp;

import SequentialSearch.SequentialSearch;
import BinarySearch.BinarySearch;
import BinarySearchTree.BST;
import Selectionsort.SelectionSort;
import BubbleSort.BubbleSort;
import InsertionSort.InsertionSort;
import MergeSort.MergeSort;
import Queue.Queue;
import QuickSort.QuickSort;
import Stack.Stack;
import java.util.Arrays;

public class AlgoImp {

    public static void main(String[] args) {
        SequentialSearch seqSearch = new SequentialSearch();
        BinarySearch binarySearch = new BinarySearch();
        SelectionSort selSort = new SelectionSort();
        BubbleSort bulSort = new BubbleSort();
        InsertionSort insSort = new InsertionSort();
        Stack stack = new Stack();
        MergeSort mergeSort = new MergeSort();
        Queue queue = new Queue();
        QuickSort quickSort = new QuickSort();
        BST bst  = new BST();

        System.out.println("Sequential Search :");
        seqSearch.Search(new int[]{6, 50, 97, 100, 240, 590, 743, 900}, 240);
        System.out.println("---------------------------------------------------");

        System.out.println("Binary Search :");
        binarySearch.binarySearch(new int[]{6, 50, 97, 100, 240, 590, 743, 900}, 240);
        System.out.println("---------------------------------------------------");

        System.out.println("Selection Sort :");
        selSort.selectionSort(new int[]{900, 50, 743, 100, 1, 590, 80, 6});
        System.out.println("---------------------------------------------------");

        System.out.println("Bubble Sort :");
        bulSort.bubbleSort(new int[]{900, 50, 743, 100, 1, 590, 80, 6});
        System.out.println("---------------------------------------------------");

        System.out.println("Insertion Sort :");
        insSort.insertionSort(new int[]{900, 50, 743, 100, 1, 590, 80, 6});
        System.out.println("---------------------------------------------------");

        System.out.println("Stack :");
        stack.push(23);
        stack.push(2);
        stack.push(73);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("---------------------------------------------------");

        System.out.println("Queue :");
        queue.enqueue(15);
        queue.enqueue(10);
        queue.enqueue(23);
        queue.dequeue();
        System.out.println("---------------------------------------------------");
        
        System.out.println("Merge Sort :");
        System.out.println(Arrays.toString(mergeSort.mergeSort(new int[]{900, 50, 743, 100, 1, 590, 80, 6})));
        System.out.println("---------------------------------------------------");
        
        System.out.println("Quick Sort :");
        int input[] = {900, 50, 743, 100, 1, 590, 80, 6};
        quickSort.sort(input);
        System.out.println("---------------------------------------------------");
        
        System.out.println("Binary Search Tree :");
        bst.insert(8);
        bst.insert(5);
        bst.insert(3);
        bst.insert(4);
        bst.preorder();
        bst.inorder();
        bst.postorder();
        bst.delete(5);
        
        System.out.println("---------------------------------------------------");
    }

}
