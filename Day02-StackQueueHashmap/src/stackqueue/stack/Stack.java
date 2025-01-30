package stackqueue.stack;

public class Stack {
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;

        }
    }
    private Node top;
    public Stack(){
        top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;

    }

    public int pop(){
        if(isEmpty())
            return -1;
        int x = top.data;
        top = top.next;
        return x;

    }

    public int peek(){
        if(isEmpty())
            return -1;
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public void display(){
        System.out.print("[ ");
        if(isEmpty()){
            System.out.print("]");
            return;
        }
        Node temp = top;
        while(temp.next != null){
            System.out.print(temp.data+", ");
        }

    }
    public int size(){
        int count = 0;
        Node temp = top;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

}
