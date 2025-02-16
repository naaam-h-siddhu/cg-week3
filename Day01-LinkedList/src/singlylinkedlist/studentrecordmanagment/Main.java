package singlylinkedlist.studentrecordmanagment;

public class Main {
    public static void main(String[] args) {
        StudentList students = new StudentList();
        students.addAtBeginning(1,"Siddhu", 21, 'B');
        students.addAtEnd(2, "Bholu", 19, 'C');
        students.addAtIndex(3,"Golu", 22, 'A',1);

        students.displayAll();
        students.searchByRollNumber(4);
        students.updateGrade(1,'F');
        students.displayAll();
    }
}
