import java.util.Scanner;

public class LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three numbers
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        // Call the static method to find the largest number
        double largest = findLargest(num1, num2, num3);

        // Display the result
        System.out.println("The largest number is: " + largest);

        scanner.close();
    }

    // Static method to find the largest number among three numbers
    public static double findLargest(double num1, double num2, double num3) {
        double largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        return largest;
    }
}
