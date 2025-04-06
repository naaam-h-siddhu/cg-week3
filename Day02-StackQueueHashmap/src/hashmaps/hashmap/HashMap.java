package hashmaps.hashmap;

class Node {

    int key, value;
    Node next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class HashMap {

    private int size;
    private Node[] nodes;

    public HashMap(int size){
        this.size = size;
        this.nodes = new Node[size];

    }
    private int hash(int key){
        return key % size;
    }
    public void put(int key , int value){
        int index = hash(key);
        if(nodes[index] == null){
            nodes[index] = new Node(key, value);

        }
        else{
            Node temp = nodes[index];
            while(true){
                if(temp.key == key){
                    temp.value = value;
                    return;
                }
                if(temp.next == null) break;
                temp = temp.next;
            }
            temp.next= new Node(key, value);
        }
    }

    public Integer get(int key){
        int index = hash(key);
        Node temp = nodes[index];
        while(temp != null){

            if(temp.key == key){
                return temp.value;

            }
            temp = temp.next;
        }
        return null;
    }
    public void remove(int key){
        int index = hash(key);
        if(nodes[index] == null) return;
        Node temp = nodes[index];
        // if the node is first
        if(temp.key == key){
            nodes[index] = temp.next;
            return;
        }
       while(temp.next != null){
           if(temp.next.key == key ){
               temp.next = temp.next.next;
               return;
           }
           temp = temp.next;

        }

    }
}
