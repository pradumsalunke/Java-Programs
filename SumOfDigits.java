import java.util.Scanner;
class SumOfDigits
 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 1000) 
        {
            System.out.println("Invalid input. Please enter a number between 0 and 1000.");
        }
        int sum = 0;

        // Extract the ones digit and add it to the sum
        int onesDigit = number % 10;
        sum = sum + onesDigit;

        // Remove the ones digit
        number = number / 10;

        // Extract the tens digit and add it to the sum
        int tensDigit = number % 10;
        sum = sum + tensDigit;

        // Remove the tens digit
        number = number / 10;

        // Extract the hundreds digit and add it to the sum
        int hundredsDigit = number % 10;
        sum = sum + hundredsDigit;

        // Display the sum of digits
        System.out.println("Sum of digits: " + sum);
    }
    
}
