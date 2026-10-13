package Queue;

public class LLimplementationOfQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);

        q.remove();
        System.out.println(q.peek());

        q.display();
    }
}
