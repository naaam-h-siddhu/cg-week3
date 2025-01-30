package stackqueue.queueimplementation;
import stackqueue.stack.Stack;

public class QueueUsingStack {
    Stack s1;
    Stack s2;

    public QueueUsingStack(){
        s1 = new Stack();
        s2 = new Stack();
    }

    public void enqueue(int data){
        s1.push(data);
        System.out.println("Enqueued : "+data);
    }
    public int dequeue(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is Empty");
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }
    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("Queue is empty");
        }
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }

        }
        return s2.peek();
    }
    public int size(){
        return s1.size()+s2.size();
    }

}
