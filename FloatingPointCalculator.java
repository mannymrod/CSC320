import java.util.Scanner;

public class FloatingPointCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables total, max, and min
        double total = 0.0;
        double max = Double.MIN_VALUE; // Will start with the smallest possible value
        double min = Double.MAX_VALUE; // Will start with the largest possible value
        double interest;
        int count = 0; // Counter will track the amount of inputs

        // Ask the user to input values
        System.out.println("Enter 5 floating-point values:");

        // Create while-loop to read five numbers
        while (count < 5) {
            System.out.print("Enter value #" + (count + 1) + ": ");
            double input = scanner.nextDouble();

            // Update the variables accordingly
            total += input;
            if (input > max) {
                max = input;
            }
            if (input < min) {
                min = input;
            }

            // Increment counter to prevent endless loop
            count++;
        }

        // Calculate the average and the interest
        double average = total / 5;
        interest = 0.2 * total;

        // Print the results
        System.out.println("\nResults:");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("20 percent interest on the total:v" + interest);
    }
}
