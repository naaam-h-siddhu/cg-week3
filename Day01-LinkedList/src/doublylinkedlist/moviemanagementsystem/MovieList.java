package doublylinkedlist.moviemanagementsystem;

public class MovieList {
    private class MovieNode{
        String movieTitle;
        String director;
        int YearOfRelease;
        double rating ;
        MovieNode next;
        MovieNode prev;

        public MovieNode(String movieTitle, String director, int yearOfRelease, double rating) {
            this.movieTitle = movieTitle;
            this.director = director;
            this.YearOfRelease = yearOfRelease;
            this.rating = rating;
            this.next = null;
            this.prev = null;
        }

    }
    private MovieNode head;
    public MovieList(){
        this.head = null;
    }
    public void addAtStart(String movieTitle, String director, int yearOfRelease, double rating){
        MovieNode newNode = new MovieNode(movieTitle, director, yearOfRelease, rating);
        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;

        System.out.println("Added at the start!");

    }
    public void addAtEnd(String movieTitle, String director, int yearOfRelease, double rating){
        MovieNode newNode = new MovieNode(movieTitle, director, yearOfRelease, rating);
        if(head == null){
           head = newNode;
        }
        else {
            MovieNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }

        System.out.println("Added at end!!1");

    }
    public void addAtIndex(String movieTitle, String director, int yearOfRelease, double rating ,int index){
        if(index == 0){
            addAtStart(movieTitle, director, yearOfRelease, rating);
            return;
        }
        MovieNode newNode = new MovieNode(movieTitle, director, yearOfRelease, rating);

        MovieNode temp = head;
        while(index > 1){
            if(temp == null){
                System.out.println("Out of index");
                return;
            }
            index--;
            temp = temp.next;

        }
        newNode.next = temp.next;
        temp.next.prev= newNode;
        newNode.prev = temp;
        temp.next = newNode;

        System.out.println("Added at index "+index);
    }
    public void deleteMovie(String movieTitle){
        if(head == null){
            System.out.println("Empty list!!1");
            return;
        }
        // CASE 1 : delete the first node
        if(head.movieTitle.equals(movieTitle)){
            if(head.next != null){
                head.next.prev = null;
            }
            head = head.next;
            System.out.println("Deleted!!1");
            return;
        }
        // CASE 2: delete node at middle os anywhere
        MovieNode temp = head;
        while(temp.next != null && !temp.next.movieTitle.equals(movieTitle)){
            temp = temp.next;


        }
        if(temp.next == null){
            System.out.println("movie not found ");
            return;
        }
        // if the node is at last
        if(temp.next.next == null){
            temp.next = null;
        }
        else {
            temp.next.next.prev = temp;
            temp.next = temp.next.next;
        }
        System.out.println("Deleted !!!");

    }
    public void search(String director, double rating){
        MovieNode temp = head;
        while(temp != null){
            if(temp.director.equals(director) ||  temp.rating == rating){
                System.out.println("Movie Title"+temp.movieTitle+" director "+temp.director+" year of release "+temp.YearOfRelease+ " Rating of movie "+temp.rating);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found !!!");
    }
    public void displayForward(){
        MovieNode temp = head;
        System.out.println("Movie list in forward order: ");
        while(temp != null){
            System.out.println(temp.movieTitle+" "+temp.director);
            temp = temp.next;

        }
    }
    public void displayBackward(){
        if(head == null) {
            System.out.println("Empty list !!");
            return;
        }

        MovieNode temp = head;
        System.out.println("Movie list in backward order:  ");
        while(temp.next != null)
            temp = temp.next;
        while(temp != null){
            System.out.println(temp.movieTitle+" "+temp.director);
            temp = temp.prev;
        }
    }

    public void updateRating(String movieTitle, double newRating){
        MovieNode temp = head;
        while(temp != null){
            if(temp.movieTitle.equals(movieTitle)){
                temp.rating = newRating;
                System.out.println("Updated !!1");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found !!!");
    }


}
