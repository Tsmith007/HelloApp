// Written by Tanner.
// A string of numbers from 1-100 counting even or odd, and summing all the lines of numbers at the end.
// tanmanalan@gmail.com

public class CountEvenOdd {
    public static void main(String[] args) {
        int sum = 0; 
       // Counts every line 1 to 100. 
        for (int i = 1; i <= 100; i++) {
            sum += i;
        // Defines whether number is even or odd.
            String evenOrOdd = (i % 2 == 0) ? "even" : "odd";
            
            System.out.println(i + "\t" + evenOrOdd);
        }
        // Adds the numbers from every line and gives a sum.
        System.out.println("Total sum: " + sum);
    }
}
