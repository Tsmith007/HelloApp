public class Book {
    String title; // Current title of the book
    String author; // Author of the book
    int publicationYear; // Year the book was published
    String[] oldTitles = new String[10]; // Array to store old titles, max size of 10
    int numberOfOldTitles = 0; // Counter for how many old titles there are

    // Book constructor requires a title, author, and publication year
    public Book(String bookTitle, String bookAuthor, int year) {
        title = bookTitle; // Assigns the title of the book
        author = bookAuthor; // Assigns the author of the book
        publicationYear = year; // Assigns the publication year of the book
    }

    // Method to calculate and display age of the book
    public void age() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int age = currentYear - publicationYear;
        System.out.println("\"" + title + "\" by " + author + " is " + age + " years old.");
    }

    // Method to change the book's title and save the old title
    public void changeTitle(String newTitle) {
        if (numberOfOldTitles < oldTitles.length) { // Check to for array overflow
            oldTitles[numberOfOldTitles] = title; // Save current title in the array
            numberOfOldTitles++; // Increment title count
        }
        title = newTitle; // Assign new title
    }

    // Returns a string with the book's title, author, and publication year
    public String toString() {
        return "Book Title: \"" + title + "\", Author: " + author + ", Publication Year: " + publicationYear;
    }

    // Main method to create Book objects
    public static void main(String[] args) {
        // Creating three Book objects
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
        Book book2 = new Book("1984", "George Orwell", 1949);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        // Display initial details
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        // Display each book's age
        System.out.println("\nAges:");
        book1.age();
        book2.age();
        book3.age();

        // Changing titles for each book and printing updated details
        book1.changeTitle("To Kill a Mockingbird: Special Edition");
        book2.changeTitle("1984: New Edition");
        book3.changeTitle("The Great Gatsby: Illustrated");

        System.out.println("\nUpdated Titles:");
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
