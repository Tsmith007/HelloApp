public class Horse {
    String name; // Current name of the horse
    int birthYear; // Year the horse was born
    String[] names = new String[10]; // Array to store old names of the horse, max size of 10
    int numberofNames = 0; // Counter for how many old names there are

    // Horse constructor requires a name and birth year
    public Horse(String horseName, int year) {
        name = horseName; // Assigns the name of the horse
        birthYear = year; // Assigns the birth year of the horse
    }

    // Method to calculate and display age
    public void age() {
        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int age = currentYear - birthYear;
        System.out.println(name + " is " + age + " years old.");
    }

    // Method to change the horse's name and save the old name
    public void changeName(String newName) {
        if (numberofNames < names.length) { // Check to avoid array overflow
            names[numberofNames] = name; // Save current name in the array
            numberofNames++; // Increment name count
        }
        name = newName; // Assign new name
    }

    // Returns a string with the horse's name and birth year
    public String toString() {
        return "Horse Name: " + name + ", Birth Year: " + birthYear;
    }

    // Main method to make the different horses
    public static void main(String[] args) {
        // Creating three horses
        Horse horse1 = new Horse("Spirit", 2015);
        Horse horse2 = new Horse("Thunder", 2018);
        Horse horse3 = new Horse("Blaze", 2020);

        // Display initial details
        System.out.println(horse1);
        System.out.println(horse2);
        System.out.println(horse3);

        // Display each horse's age
        System.out.println("\nAges:");
        horse1.age();
        horse2.age();
        horse3.age();

        // Changing names for each horse and printing updated details
        horse1.changeName("Shadow");
        horse2.changeName("Lightning");
        horse3.changeName("Storm");

        System.out.println("\nUpdated Names:");
        System.out.println(horse1);
        System.out.println(horse2);
        System.out.println(horse3);
    }
}
