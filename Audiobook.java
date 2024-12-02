// AudioBook.java
public class Audiobook extends Book {
    public String narrator; // Name of the narrator for the audiobook
    public double length; // Length of the audiobook in hours

    // Constructor for AudioBook, includes all Book parameters plus narrator and length
    public Audiobook(String bookTitle, String bookAuthor, int year, String narratorName, double audioLength) {
        super(bookTitle, bookAuthor, year); // Call the constructor of the parent class (Book)
        narrator = narratorName; // Assign the narrator's name
        length = audioLength; // Assign the length of the audiobook
    }

    // Method to display sample audio play
    public void displayAudioBookInfo() {
        System.out.println("Playing a sample from \"" + title + "\" narrated by " + narrator);
    }

    // Override the toString method to include audiobook-specific information
    @Override
    public String toString() {
        return super.toString() + ", Narrator: " + narrator + ", Length: " + length + " hours";
    }
}
