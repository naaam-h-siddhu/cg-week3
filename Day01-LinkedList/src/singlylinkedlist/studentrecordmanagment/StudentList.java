package singlylinkedlist.studentrecordmanagment;

public class StudentList {
    private class StudentNode{
        int rollNumber;
        String name;
        int age;
        char grade;
        StudentNode next;

        public StudentNode(int rollNumber, String name, int age, char grade) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age = age;
            this.grade = grade;
            this.next = null;

        }

    }
    private StudentNode head;
    public StudentList(){
        this.head = null;

    }
    // Add at beginning
    public void addAtBeginning(int rollNumber, String name,int age , char grade){
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
        System.out.println("added at beginning");
    }
    // Add at end
    public void addAtEnd(int rollNumber, String name, int age, char grade){
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if(head == null){
            head = newNode;

        }
        else{
            StudentNode temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("added at end");
    }
    // Add at any index
    public void addAtIndex(int rollNumber, String name, int age, char grade, int index ){
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (index == 0) {
            addAtBeginning(rollNumber, name, age, grade);

        }
        StudentNode temp = head;
        while(index> 1){
            if(temp == null){
                System.out.println("Index out of bound");
                return;
            }
            temp = temp.next;
            index--;

        }
        newNode.next = temp.next;
        temp.next = newNode;
        System.out.println("Added at index "+index);


    }
    // delete using roll number
    public void delete(int rollNumber){
        if(head == null) {
            System.out.println("Empty list");
            return;
        }
        if(head.rollNumber== rollNumber){
            head = head.next;
            System.out.println("Deleted");
            return;
        }
        StudentNode temp = head;
        while(temp.next  != null && temp.next.rollNumber != rollNumber){
            temp=temp.next;
        }
        if(temp.next == null){
            System.out.println("roll number not found");
            return;
        }
        temp.next = temp.next.next;
        System.out.println("Deleted");

    }
    // Search by roll number
    public void searchByRollNumber(int rollNumber){
        StudentNode temp = head;
        while(temp != null){
            if(temp.rollNumber == rollNumber){
                System.out.println("Student found: Roll Number: " + temp.rollNumber +
                        ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not Found!!");

    }
    // Display all the details of students
    public void displayAll(){
        if(head == null){
            System.out.println("Empty list");
        }
        StudentNode temp = head;
        System.out.println("Student List: ");
        while(temp != null){
            System.out.println(" Roll Number: " + temp.rollNumber + ", Name: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;

        }
    }
    // Upgrade Grade of student
    public void updateGrade(int rollNumber, char newGrade){
        StudentNode temp = head;
        while(temp != null){
            if(temp.rollNumber == rollNumber){
                temp.grade = newGrade;
                System.out.println("Updated!!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found");
    }


}
