package Queue;

import java.util.*;;

public class traversalOfQueue {

    private static void display(Queue<Integer> q) {
        int n = q.size();
        for (int i = 0; i < n; i++) {
            System.out.print(q.peek() + " ");
            q.add(q.remove());
        }
    }

    private static void pushAtIndex(Queue<Integer> q, int val, int idx) {
        int n = q.size();
        if (idx > n || idx < 0) {
            System.out.println("Invalid Index");
            return;
        }
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        q.add(val);
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
    }

    private static int peekAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        int ans = -1;
        if (idx > n || idx < 0) {
            System.out.println("Invalid Index");
            return -1;
        }
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        ans = q.peek();
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
        return ans;
    }

    private static int removeAtIndex(Queue<Integer> q, int idx) {
        int n = q.size();
        int ans = -1;
        if (idx > n || idx < 0) {
            System.out.println("Invalid Index");
            return -1;
        }
        for (int i = 0; i < idx; i++) {
            q.add(q.remove());
        }
        ans = q.remove();
        for (int i = 0; i < n - idx; i++) {
            q.add(q.remove());
        }
        return ans;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(10);
        q.add(20);
        q.add(30);
        q.add(50);
        q.add(60);

        pushAtIndex(q, 40, 10);

        System.out.println(peekAtIndex(q, 3));
        System.out.println(removeAtIndex(q, 5));
        display(q);
    }
}
