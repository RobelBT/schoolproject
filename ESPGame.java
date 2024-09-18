/*
 * Class: CMSC203 
 * Instructor:Ahmed Tarek
 * Description: This a game where the user has to guess a randomly selected color for 11 rounds.
 * Due: 09/17/2024
 * Platform/compiler:JAVA
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Robel Tedros
*/
package assignment1;
import java.util.Scanner;
import java.util.Random;

public class Guessgame {

	public static void main(String[] args) {
		// Constants for colors
        final String C_RED = "Red";
        final String C_GREEN = "Green";
        final String C_BLUE = "Blue";
        final String C_ORANGE = "Orange";
        final String C_YELLOW = "Yellow";

        // Array of colors using the constants (no ArrayLists allowed)
        final String[] COLORS = {C_RED, C_GREEN, C_BLUE, C_ORANGE, C_YELLOW};

        // Create objects for input and random number generation
        Scanner answer = new Scanner(System.in);
        Random random = new Random();

        // Get user details
        System.out.print("Enter your name: ");
        String name = answer.nextLine();
        
        System.out.print("Describe yourself: ");
        String description = answer.nextLine();
        
        System.out.print("Due Date (MM/DD/YY): ");
        String dueDate = answer.nextLine();

        // introduction of game
        System.out.println("\nCMSC203 Assignment1: Test your ESP skills!");

        int correctGuesses = 0;
        final int MAX_ROUNDS = 11;
        int round = 1;

        // Loop for 11 rounds using a while loop 
        while (round <= MAX_ROUNDS) {
            System.out.println("\nRound " + round);
            System.out.println("I am thinking of a color.");
            System.out.println("Pick one from Red, Green, Blue, Orange, or Yellow:");

            // Randomly select a color
            String selectedColor = COLORS[random.nextInt(COLORS.length)];

            // Variables for input validation
            String userChoice = "";
            boolean correctChoice = false;

            while (!correctChoice) {
                System.out.print("Enter your guess: ");
                userChoice = answer.nextLine().trim();
                //validate user input using switch case
                switch (userChoice.toLowerCase()) {
                    case "red":
                    case "green":
                    case "blue":
                    case "orange":
                    case "yellow":
                        correctChoice = true;  // Input is valid
                        break;
                    default:
                        System.out.println("Oops! That’s not a valid color. Try again!");
                        break;
                }
            }

            // Provide random feedback after guessing
            String[] feedbackMessages = {
                "Good try!", "Nice guess!", "Let's see if you were right.", "You're doing great!"
            };
            String randomFeedback = feedbackMessages[random.nextInt(feedbackMessages.length)];
            System.out.println(randomFeedback);

            // Check if the guess matches the selected color
            System.out.println("I was thinking of " + selectedColor + ".");
            if (userChoice.equalsIgnoreCase(selectedColor)) {
                correctGuesses++;
            }

            // Add a small feature: show the correct guess count so far
            System.out.println("So far, you've guessed correctly " + correctGuesses + " time(s).");
            
            round++;
        }

        // Game over, display results
        System.out.println("\nGame Over");
        System.out.println("You guessed " + correctGuesses + " out of " + MAX_ROUNDS + " colors correctly.");
        System.out.println("Student Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Due Date: " + dueDate);

        // Close the scanner
        answer.close();
    }

}
