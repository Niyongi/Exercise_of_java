import java.util.Scanner;

public class SumCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate the sum using the static method
        int sum = calculateSum(num1, num2);

        // Display the result
        System.out.println("Sum of numbers between " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }

    // Static method to calculate the sum of all numbers between two given numbers
    public static int calculateSum(int num1, int num2) {
        int sum = 0;
        // Ensure num1 is smaller than num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        // Calculate the sum of all numbers between num1 and num2 (inclusive)
        for (int i = num1; i <= num2; i++) {
            sum += i;
        }
        return sum;
    }
}
