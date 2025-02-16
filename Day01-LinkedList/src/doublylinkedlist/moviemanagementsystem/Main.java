package doublylinkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {
        MovieList movies = new MovieList();
        movies.addAtStart("Interstellar", "Nolan",2011,9.8);
        movies.addAtEnd("Ftug","siddhu",2025,8.65);
        movies.addAtIndex("chirag","Sudhakar",2018,7.54,1);
        movies.displayBackward();
        movies.displayForward();
        movies.deleteMovie("chirag");
        movies.search("siddhu",10.0);

    }
}


