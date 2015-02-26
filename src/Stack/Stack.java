package Stack;

public class Stack {

    private static final int capacity = 3;
    int arr[] = new int[capacity];
    int top = -1;

    public void push(int pushedElement) {
        if (top < capacity - 1) {
            top++;
            arr[top] = pushedElement;
            System.out.print("After Push: ");
            printElements();
            System.out.println();
        } else {
            System.out.println("Stack Overflow !");
        }
    }

    public void pop() {
        if (top >= 0) {
            top--;
            System.out.print("After Pop: ");
            printElements();
            System.out.println();
        } else {
            System.out.println("Stack Underflow !");
        }
    }

    public void printElements() {
        if (top >= 0) {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }

}
