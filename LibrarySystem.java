// Base class Item
class Item {
    protected String title;
    protected String author;
    protected int publicationYear;

    // Constructor
    public Item(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Method to display item details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}

// Derived class Book
class Book extends Item {
    private String genre;

    // Constructor
    public Book(String title, String author, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }

    // Overriding method to display book details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

// Derived class Magazine
class Magazine extends Item {
    private int issueNumber;

    // Constructor
    public Magazine(String title, String author, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }

    // Overriding method to display magazine details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}

// Main class to demonstrate inheritance
public class LibrarySystem {
    public static void main(String[] args) {
        // Creating a Book object
        Book book = new Book("i dont love you anymore", "Ritvik sigh",  2024, "Fiction");
        System.out.println("Book Details:");
        book.displayDetails();

        System.out.println();

        // Creating a Magazine object
        Magazine magazine = new Magazine("National Geographic", "Various", 2023, 250);
        System.out.println("Magazine Details:");
        magazine.displayDetails();
    }
}

