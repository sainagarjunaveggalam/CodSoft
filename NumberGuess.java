import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        
        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
            int numberOfAttempts = 0;
            int maxAttempts = 7; // Maximum number of attempts
            boolean hasGuessedCorrectly = false;
            
            System.out.println("Welcome to the Game!");
            System.out.println("I'm thinking of a number from 1 to 100.You can guess it");
            System.out.println("You have " + maxAttempts + " attempts.");

            while (numberOfAttempts < maxAttempts && !hasGuessedCorrectly) {
                System.out.print("Enter guess of yours:");
                int userGuess = scanner.nextInt();
                numberOfAttempts++;

                if (userGuess < numberToGuess) {
                    System.out.println("It is too low");
                } else if (userGuess > numberToGuess) {
                    System.out.println("It is too high");
                } else {
                    System.out.println("Congrats! You guessed the number correctly in " + numberOfAttempts + " attempts.");
                    hasGuessedCorrectly = true;
                }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry,You have used all your attempts. The correct number was: " + numberToGuess);
            }

            // Ask the user if they want to play another round
            System.out.print("Do you want to play again? (yes/no): ");
            String userResponse = scanner.next();
            playAgain = userResponse.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for playing!");
        scanner.close();
    }
}

    

