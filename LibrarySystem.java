
class item {
    protected String title;
    protected String author;
    protected int publication_year;

    public item(String title, String author, int publication_year) {
        this.title = title;
        this.author = author;
        this.publication_year = publication_year;
    }

    public void display_details() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publication_year);
    }
}

class Book extends item {
    private String genre;

    public Book(String title, String author, int publication_year, String genre) {
        super(title, author, publication_year);
        this.genre = genre;
    }

    @Override
    public void display_details() {
        super.display_details();
        System.out.println("Genre: " + genre);
        
    }
}


class Magazine extends item {
    private int issueNumber;
    private String publisher;

    public Magazine(String title, String author, int publication_year, int issueNumber, String publisher) {
        super(title, author, publication_year);
        this.issueNumber = issueNumber;
        this.publisher = publisher;
    }

    @Override
    public void display_details() {
        super.display_details();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Publisher: " + publisher);
    }
}


public class LibrarySystem {
    public static void main(String[] args) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Fiction");
        Magazine magazine = new Magazine("National Geographic", "Various", 2023, 12, "NatGeo Publishing");

        System.out.println("Book Details:");
        book.display_details();

        System.out.println("\nMagazine Details:");
        magazine.display_details();
    }
}

