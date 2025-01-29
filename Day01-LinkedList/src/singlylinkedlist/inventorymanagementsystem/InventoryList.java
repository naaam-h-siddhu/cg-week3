package singlylinkedlist.inventorymanagementsystem;

public class InventoryList {
    private class InventoryNode{
        String name;
        int itemId;
        int quantity;
        int price;
        InventoryNode next;

        public InventoryNode(String name, int itemId, int quantity, int price) {
            this.name = name;
            this.itemId = itemId;
            this.quantity = quantity;
            this.price = price;
            this.next = null;

        }
    }

    private InventoryNode head;
    public InventoryList(){
        this.head = null;

    }
    public void addAtStart(String name, int itemId, int quantity, int price){
        InventoryNode newNode = new InventoryNode(name, itemId, quantity, price);
        newNode.next = head;
        head = newNode;
        System.out.println("Added at the start !!!");
    }
    public void addAtEnd(String name, int itemId, int quantity, int price){
        InventoryNode newNode = new InventoryNode(name, itemId, quantity, price);
        if(head == null){
            head = newNode;

        }
        else{
            InventoryNode temp = head;
            while(temp.next != null){
                temp= temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Added at end !!1");
    }
    // Add at any index
    public void addAtIndex(String name, int itemId, int quantity, int price, int index){
        if(index == 0){
            addAtStart(name, itemId, quantity, price);
            return;
        }
        InventoryNode newNode = new InventoryNode(name, itemId, quantity, price);
        InventoryNode temp = head;
        while(index-- > 0){
            if(temp == null){
                System.out.println("Index out of bound !!");
                return;
            }
            temp = temp.next;

        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("added at index "+index);

    }
    // delete the item
    public void deleteItem(int itemId){

        if(head == null){
            System.out.println("Empty list !!");
            return;
        }
        if(head.itemId == itemId){
            head = head.next;
            System.out.println("deleted !!1");
            return ;

        }
        InventoryNode temp = head;
        while(temp.next != null  && temp.next.itemId == itemId){
            temp = temp.next;

        }
        if(temp.next == null){
            System.out.println("Item does not exists !!1");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Deleted");
    }
    // update the quantity

    public void updateItem(int itemId, int newQuantity){
        InventoryNode temp = head;
        while(temp != null){
            if(temp.itemId == itemId){
                temp.quantity = newQuantity;
                System.out.println("Updated the quantity !!");
                return;
            }

        }
        System.out.println("Item not found !!!");
    }
    // Search the item using the item id and item name

    public void searchItem(int itemId, String itemName){
        if(head == null){
            System.out.println("Empty list !!");
            return;
        }
        InventoryNode temp = head;
        boolean flag = false;
        do {
            if(temp.itemId == itemId || temp.name.equals(itemName)){

                System.out.println("Item id: "+temp.itemId+" Item name "+temp.name+" Item price : "+temp.price+" quantity "+temp.quantity);
                flag = true;
                return;
            }
            temp = temp.next;
        }
        while(temp != null);
        if (!flag){
            System.out.println("Item not found !!1j");
        }
    }
    private double calculateTotal(){

        double total = 0;
        InventoryNode temp = head;
        do {
            total+= (temp.price * temp.quantity);
            temp= temp.next;
        }
        while(temp != null);
        return total;
    }
    public void totalValue(){
        System.out.println("total value of inventory = "+calculateTotal());
    }
    //sorting using merge sort

    private InventoryNode mergeSort(InventoryNode head, boolean sortByName){
        if(head  == null || head.next == null){
            return  head;
        }
        InventoryNode middle = getMiddle(head);
        InventoryNode middleNext = middle.next;
        middle.next = null;

        InventoryNode left = mergeSort(middle, sortByName);
        InventoryNode right = mergeSort(middleNext, sortByName);

        return merge(left, right, sortByName);

    }
    private InventoryNode merge(InventoryNode left, InventoryNode right , boolean sortByName){
        if(left == null) return right;
        if(right == null) return left;

        if((sortByName && left.name.compareTo(right.name) < 0  || (!sortByName && left.price <= right.price))){

            left.next = merge(left.next, right, sortByName);
            return left;

        }
        else{
            right.next = merge(left, right.next, sortByName);
            return right;
        }
    }
    public void sortInventory(boolean sortByName){
        head = mergeSort(head, sortByName);
    }
    private InventoryNode getMiddle(InventoryNode head){

        InventoryNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
