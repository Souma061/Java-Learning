
import java.util.Scanner;
import java.util.Random; // it is used to generate random numbers.


public class random_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.println("number Guessing Game!");
        System.out
                .println("I have selected a random number between 1 and 100. Can you guess it? You have 10 attempts.");
        int randomNumber = rand.nextInt(100) + 1;
        // System.err.println("Debug: The random number is " + randomNumber); // debugging line for me.
        int attempt = 10;
        boolean guessedCorrectly = false;
        while (attempt > 0 && !guessedCorrectly) {
            System.out.println("Enter your guess: ");
            int numberGuess = sc.nextInt();
            if (numberGuess == randomNumber) {
                guessedCorrectly = true;
                System.out.println("Congo !! You guessed the number correctly in " + (10 - attempt + 1) + " attempts.");

            } else if (numberGuess < randomNumber) {
                System.out.println("Huhh! Your guess is too low. Try again.");
            } else {
                System.out.println("Oh no! Your guess is too high. Try again.");
            }
            attempt--;
        }
        if (!guessedCorrectly) {
            System.out.println("Sorry, you've used all your attempts. The number was: " + randomNumber);
        }

        System.out.println("Thanks for playing the Number Guessing Game! Goodbye!");
        sc.close();

    }
}
