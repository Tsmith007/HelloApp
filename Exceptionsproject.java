//Tanner Smith
//tanmanalan@gmail.com
//For Mr. Gross Programming class
public class ErrorHandlingExample {
    public static void main(String[] args) {
        System.out.println("Starting the program...");

        // First try-catch block to handle ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing an out-of-bounds element: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Tried to access an array element that doesn't exist. Arrays in Java start from index 0 and go up to size-1.");
        }

        // Continue with the next part of the program
        System.out.println("Continuing with math problems...");

        // Second try-catch block to handle ArithmeticException
        try {
            int result = 10 / 0;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed in mathematics or programming.");
        }

        // Final message
        System.out.println("Program caught all errors and completed without crashing.");
    }
}
