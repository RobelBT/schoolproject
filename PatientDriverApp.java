/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: Collects patient information then gives back a summary of the information
 * Due: 10/01/2024
 * Platform/compiler: JAVA
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Robel Tedros
*/
import java.util.Scanner;

public class PatientDriverApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // ask user for details regarding the patient
        System.out.println("Enter patient details:");
        System.out.print("First Name: ");
        String firstName = input.nextLine();
        System.out.print("Middle Name: ");
        String middleName = input.nextLine();
        System.out.print("Last Name: ");
        String lastName = input.nextLine();
        System.out.print("Street Address: ");
        String streetAddress = input.nextLine();
        System.out.print("City: ");
        String city = input.nextLine();
        System.out.print("State: ");
        String state = input.nextLine();
        System.out.print("ZIP Code: ");
        String zipCode = input.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = input.nextLine();
        System.out.print("Emergency Contact Name: ");
        String emergencyContactName = input.nextLine();
        System.out.print("Emergency Contact Phone Number: ");
        String emergencyContactPhone = input.nextLine();

        // instance using the user input
        Patient patient = new Patient(firstName, middleName, lastName, 
                                      streetAddress, city, state, zipCode, 
                                      phoneNumber, emergencyContactName, emergencyContactPhone);

        // Get Procedure details from user
        Procedure[] procedures = new Procedure[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Procedure " + (i + 1) + ":");
            System.out.print("Procedure Name: ");
            String procedureName = input.nextLine();
            System.out.print("Procedure Date (MM/DD/YYYY): ");
            String procedureDate = input.nextLine();
            System.out.print("Practitioner: ");
            String practitioner = input.nextLine();
            System.out.print("Charge: ");
            double charge = input.nextDouble();
            input.nextLine();  // Consume the newline character

            // Create a Procedure instance
            procedures[i] = new Procedure(procedureName, procedureDate, practitioner, charge);
        }

        // Display patient information
        System.out.println("\nPatient info:");
        System.out.println(patient);

        // Display procedure information
        System.out.println();
        for (Procedure procedure : procedures) {
            System.out.println(procedure);
            System.out.println();
        }

        // Calculate and display total charges
        double totalCharges = calculateTotalCharges(procedures);
        System.out.printf("Total Charges: $%,.2f%n", totalCharges);

        // Display developer info
        System.out.println("\nStudent Name: Robel Tedros");
        System.out.println("MC#: MC21176683");
        System.out.println("Due Date: 10/01/2024");

        input.close();
    }

    // Method to calculate total charges
    public static double calculateTotalCharges(Procedure[] procedures) {
        double total = 0;
        for (Procedure procedure : procedures) {
            total += procedure.getCharge();
        }
        return total;
    }
}