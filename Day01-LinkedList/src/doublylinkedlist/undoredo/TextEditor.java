package doublylinkedlist.undoredo;
//Problem Statement: Design an undo/redo functionality for a text editor using a doubly linked
//list. Each node represents a state of the text content (e.g., after typing a word or performing a
//        command). Implement the following:
//        1. Add a new text state at the end of the list every time the user types or performs an
//2. 3. 4. 5. action.
//Implement the undo functionality (revert to the previous state).
//Implement the redo functionality (revert back to the next state after undo).
//Display the current state of the text.
//Limit the undo/redo history to a fixed size (e.g., last 10 states).
//Hint:
//        ●
//        ●
//        ●
//Use a doubly linked list where each node represents a state of the text.
//The next pointer will represent the forward history (redo), and the prev pointer will
//represent the backward history (undo).
//Keep track of the current state and adjust the next and prev pointers for undo/redo
//operations


public class TextEditor {

    private class TextState{
        private String content;
        TextState next, prev;
        TextState(String content){
            this.content = content;
            this.next = this.prev = null;
        }
    }

    private TextState head,tail, current;
    private int history = 0;
    private int maxHistory = 10;

    public TextEditor(){
        head =tail =current =  null;
    }
    public void addState(String content){
        TextState newState = new TextState(content);

        if(current != null){
            current.next = newState;
            newState.prev = current;

        }
        else{
            head = newState;
        }
        current = newState;
        tail = newState;

        history++;
        if(history> maxHistory){
            head = head.next;
            if(head != null) head.prev = null;
            history--;
        }

    }

    public void undo(){
        if(current != null && current.prev != null){
            current = current.prev;
            System.out.println("Undo "+current.content);
        }
        else{
            System.out.println("Nothing to undo !");
        }
    }

    public void redo(){
        if(current != null && current.next != null){
            current = current.next;
            System.out.println("Redo "+current.content);
        }
        else
            System.out.println("Nothing to redo !");
    }

    public void displayCurrentState(){
        if(current != null){
            System.out.println("current state : "+current.content);
        }
        else
            System.out.println("No text available ");
    }



}
