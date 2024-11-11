import java.util.Scanner;

//Define a class for TaxWithholdingCalculator
public class TaxWithholdingCalculator {

    //Method call that will calculate the tax withholding based on weekly income
    public static double calculateTax(double weeklyIncome) {

        //Initialize the variable declared for tax rate
        double taxRate = 0.0;

        //Declare the determined tax rate based on the set income range
        if (weeklyIncome < 500) {
            //tax rate at 10%
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            //tax rate at 15%
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            //tax rate at 20%
            taxRate = 0.20;
        } else if (weeklyIncome >= 2500) {
            //Tax rate at 30%
            taxRate = 0.30;
        }

        //Create tax withholding amount calculation
        double taxWithholding = weeklyIncome * taxRate;

        //return the calculation for tax withholding
        return taxWithholding;
    }

    //Create and structure main method to allow user to input amount and calculate tax withholding
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ask user to enter amount
        System.out.print("Enter weekly income: ");
        double weeklyIncome = scanner.nextDouble();

        //Call method to calculate tax withholding
        double taxWithholding = calculateTax(weeklyIncome);

        //Print weekly tax withholding
        System.out.println("Weekly Tax Withholding: $" +taxWithholding);

        scanner.close();
    }
}
