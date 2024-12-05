// Main.java
public class Main { 
    public static void main (String[] args){
                // Creating Book, EBook, and AudioBook objects
                Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);
                EBook ebook1 = new EBook("1984", "George Orwell", 1949, "July 8, 2021", "Stephen Fry");
                Audiobook audiobook1 = new Audiobook("The Great Gatsby","F. Scott Fitzgerald", 1925, "Jake Gyllenhaal", 5.2);


        // Display initial detail
        System.out.println(book1);
        System.out.println(ebook1);
        System.out.println(audiobook1);

        // Display each book's age
        System.out.println("\nAges:");
        book1.age();
        ebook1.age();
        audiobook1.age();

        // Changing titles for each book and printing updated details
        book1.changeTitle("To Kill a Mockingbird: Special Edition");
        ebook1.changeTitle("1984: New Edition");
        (audiobook1).changeTitle("The Great Gatsby: Illustrated");

        System.out.println("\nUpdated Titles:");
        System.out.println(book1);
        System.out.println(ebook1);
        System.out.println(audiobook1);

        // Demonstrate subclass-specific methods
        System.out.println("\nAdditional Features:");
        ebook1.displayEBookInfo();
        audiobook1.playSample();
    }
}

