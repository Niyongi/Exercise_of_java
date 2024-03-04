import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate sum of digits
        int sum = calculateSumOfDigits(number);

        // Display the result
        System.out.println("Sum of digits: " + sum);

        scanner.close();
    }

    // Static method to calculate sum of digits
    public static int calculateSumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}
