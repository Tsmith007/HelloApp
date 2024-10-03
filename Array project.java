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
        // Uses length method to calculate the sum.
        String[] str = { "total sum:" };
        System.out.println(str[0].length());
    }
}

