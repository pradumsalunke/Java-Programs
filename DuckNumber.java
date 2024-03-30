import java.util.*;

class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int rem = 0;
        int count = 0;
        
        // Loop to check for zero digits (excluding the first digit)
        while (num != 0) {
            rem = num % 10;
            if (rem == 0) {
                count++;
                break;
            }
            num /= 10;
        }

        // Check if any zero digit (excluding the first digit) was found
        if (count > 0) {
            System.out.println("Duck number");
        } else {
            System.out.println("Not a duck number");
        }
    }
}
