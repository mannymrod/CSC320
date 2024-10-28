import java.util.Scanner;

// Create Person CLass
class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String zipCode;

    // Constructor gather a persons information
    public Person(String firstName, String lastName, String streetAddress, String city, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zipCode = zipCode;
    }
    // Create Method to print the persons information
    public void printPersonInfo() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Street Address: " + streetAddress);
        System.out.println("City: " + city);
        System.out.println("Zip Code: " +zipCode);
    }
}
// Create Main class to run the program
public class Main {
    public static void main(String[] args) {
        //Create a new person object with there information
        Scanner input = new Scanner(System.in);

        //Ask user to input information
        System.out.println("Enter First Name: ");
        String firstName = input.nextLine();
        System.out.println("Enter Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Enter Street Address: ");
        String streetAddress = input.nextLine();
        System.out.println("Enter City: ");
        String city = input.nextLine();
        System.out.println("Enter Zip Code: ");
        String zipCode = input.nextLine();

        // Create the a new person object with the information inputed
        Person person = new Person(firstName, lastName, streetAddress, city, zipCode);

        //Call on Method created to print the information
        System.out.println("\nPerson's Information: ");
        person.printPersonInfo();

        //Close the scanner
        input.close();
    }
}