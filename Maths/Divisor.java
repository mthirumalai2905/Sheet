import java.util.ArrayList;
import java.util.Collections;

class Divisor {
    public static void print_divisors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        // Check for all divisors up to the square root of n
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If i is a divisor, add it to the list
                list.add(i);
                
                // If n / i is a distinct divisor, add it to the list
                if (i != n / i) {
                    list.add(n / i);
                }
            }
        }
        
        // Sort the list to ensure divisors are in ascending order
        Collections.sort(list);
        
        // Print the divisors
        for (int num : list) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int n = 28; // Example input
        print_divisors(n); // Expected output: 1 2 4 7 14 28
    }
}
