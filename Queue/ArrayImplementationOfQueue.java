package Queue;

class CircularQueue {
    int[] arr;
    int f;
    int r;
    int size;

    CircularQueue(int capacity) {
        arr = new int[capacity];
    }

    void add(int val) {
        if (size == arr.length) {
            System.out.println("Invalid Operation");
            return;
        }
        arr[r++] = val;
        size++;
        if (r == arr.length)
            r = 0;
    }

    int remove() {
        if (size == 0) {
            System.out.println("Invalid Operation");
            return -1;
        }
        int front = arr[f];
        f++;
        size--;
        if (f == arr.length)
            f = 0;
        return front;
    }

    void peek() {
        if (size == 0) {
            System.out.println("Invalid Operation");
            return;
        }
        System.out.println(arr[f]);
    }

    void display() {
        if (size == 0) {
            System.out.print("NO Element To Print");
            return;
        }
        if (f >= r) {
            for (int i = f; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            for (int i = 0; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
        } else {
            for (int i = f; i < r; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

public class ArrayImplementationOfQueue {
    public static void main(String[] args) {
        CircularQueue c = new CircularQueue(5);
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);

        c.remove();
        c.remove();

        c.add(100);
        c.remove();
        c.peek();
        c.display();

    }
}
