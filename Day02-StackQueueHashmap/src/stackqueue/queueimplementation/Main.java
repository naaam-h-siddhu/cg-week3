package stackqueue.queueimplementation;

public class Main {
    public static void main(String[] args) {

        QueueUsingStack q = new QueueUsingStack();
        q.enqueue(12);
        q.enqueue(22);
        q.enqueue(32);
        q.enqueue(42);

        System.out.println(q.peek());
        q.dequeue();
        System.out.println(q.peek());
        q.dequeue();
        q.dequeue();
        System.out.println(q.peek());

    }

}
