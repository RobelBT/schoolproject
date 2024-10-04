import java.util.Scanner;

public class MovieDriver {
    public static void main(String[] args) {
        // Create a new object of type Scanner
        Scanner keyboard = new Scanner(System.in);
        
        // Variable to control the loop
        String continueResponse;
        
        // Loop to handle multiple movies
        do {
            // Create a new movie object
            Movie movie = new Movie();
            
            // Prompt user for the movie title
            System.out.print("Enter the name of a movie: ");
            String title = keyboard.nextLine();
            movie.setTitle(title); // Set the title
            
            // Prompt user for the movie rating
            System.out.print("Enter the rating of the movie: ");
            String rating = keyboard.nextLine();
            movie.setRating(rating); // Set the rating
            
            // Prompt user for the number of tickets sold
            System.out.print("Enter the number of tickets sold for this movie: ");
            int soldTickets = keyboard.nextInt();
            movie.setSoldTickets(soldTickets); // Set tickets sold
            
            // Print out the movie information
            System.out.println(movie.toString());
            
            // Ask if the user wants to continue
            System.out.print("Do you want to enter another? (y or n): ");
            keyboard.nextLine(); // Consume newline left-over
            continueResponse = keyboard.nextLine();
        } while (continueResponse.equalsIgnoreCase("y")); // Continue loop if response is "y"
        
        // Close the scanner
        keyboard.close();
        
        // Print goodbye message
        System.out.println("Goodbye");
    }
}