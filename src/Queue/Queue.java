package Queue;

public class Queue {

    private static final int capacity = 3;
    int arr[] = new int[capacity];
    int size = 0;
    int top = -1;
    int rear = 0;

    public void enqueue(int pushedElement) {
        if (top < capacity - 1) {
            top++;
            arr[top] = pushedElement;
            display();
        } else {
            System.out.println("Overflow !");
        }

    }

    public void dequeue() {
        if (top >= rear) {
            rear++;
            display();
        } else {
            System.out.println("Underflow !");
        }
    }

    public void display() {
        if (top >= rear) {
            for (int i = rear; i <= top; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }

}
