import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemperaturesFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create the ArrayLists to store days and temperatures in Celsius
        ArrayList<String> days = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();
        
        // Add the days to the ArrayList
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        
        // Ask user to enter a temperatures
        System.out.println("Enter the average temperature for each day of the week (Celsius):");
        for (String day : days) {
            System.out.println(day + ": ");
            double temp = scanner.nextDouble();
            temperatures.add(temp);
        }
        
        // Main Program Loop
        while (true) {
            System.out.println("Enter a day of the week to view its temperature (Fahrenheit), or type 'Week' to see the weekly summary:" );
            String input = scanner.next();
            
            if (input.equalsIgnoreCase("Week")) {
                // Displaying the temperatures of the week and calculating the weekly average
                double totalTempCelsius = 0.0;
                System.out.println("Weekly Temperatures in Fahrenheit:");
                for (int i = 0; i < days.size(); i++) {
                    double tempCelsius = temperatures.get(i);
                    double tempFahrenheit = tempCelsius * 9 / 5 + 32;
                    System.out.println(days.get(i) + ": " + tempFahrenheit + "°F");
                    totalTempCelsius += tempFahrenheit;
                }
                double averageTempCelsius = totalTempCelsius / days.size();
                double averageTempFahrenheit = averageTempCelsius * 9 / 5 + 32;
                System.out.println("Weekly Temperatures in Fahrenheit:" + averageTempFahrenheit + "°F");
                // Exit the loop after printing the weekly summary
                break;
            } else {
                //Validate if the input matches a day
                boolean found = false;
                for (int i = 0; i < days.size(); i++) {
                    if (days.get(i).equalsIgnoreCase(input)) {
                        double tempCelsius = temperatures.get(i);
                        double tempFahrenheit = tempCelsius * 9 / 5 + 32;
                        System.out.println(days.get(i) + "'s Temperature: " + tempFahrenheit + "°F");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Invalid input. Enter a valid day or 'week' to see the weekly summary.");
                }
            }
        }
        
        // Close Scanner
        scanner.close();
    }
}
