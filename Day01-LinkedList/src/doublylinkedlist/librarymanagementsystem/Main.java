package doublylinkedlist.librarymanagementsystem;

public class Main {
    public static void main(String[] args) {
        BookList books = new BookList();
        books.addToStart("Book1", "Siddhu", "Action", 1, "Not Available");
        books.addToEnd("Book2", "Sudhakar","Adventure", 2, "Available");
        books.addAtIndex("Book2", "Pandey Ji", "Horror", 3, "Available", 1);

        books.displayForward();
        System.out.println();
        books.displayBackward();

        books.addAtIndex("Book4", "Fevicol", "Sci-fi", 3, "Not Available", 2);
        books.searchBook("Book4","Fevicol");
        books.updateAvailability(3, "Available");

        books.deleteUsingBookId(2);
        books.getCount();
        books.displayForward();
    }
}