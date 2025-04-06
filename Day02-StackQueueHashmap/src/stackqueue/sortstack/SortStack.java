package stackqueue.sortstack;

import stackqueue.stack.Stack;

public class SortStack {
    public static void sortStack(Stack s){
        if(s.isEmpty())
            return;
        int top = s.pop();
        sortStack(s);
        insertStack(s,top);
    }
    public static void insertStack(Stack s, int x){
        if(s.isEmpty() || s.peek() >= x){
            s.push(x);
            return;
        }
        int top = s.pop();
        insertStack(s,x);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(1);
        s.push(3);
        s.push(2);
        s.push(4);
        System.out.println("Unsorted Stack ");
        s.display();
        sortStack(s);
        System.out.println("sorted stack ");
        s.display();
    }
}
