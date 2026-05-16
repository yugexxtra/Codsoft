import java.util.Scanner;
import java.util.Random;

public class GuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        int randomNumber = rd.nextInt(100) + 1;

        int userGuess = 0;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess number between 1 to 100");

        while(userGuess != randomNumber) {

            System.out.print("Enter your guess : ");
            userGuess = sc.nextInt();

            attempts++;

            if(userGuess > randomNumber) {
                System.out.println("Your number is too high");
            }
            else if(userGuess < randomNumber) {
                System.out.println("Your number is too low");
            }
            else {
                System.out.println("Correct Guess!");
                System.out.println("You guessed in " + attempts + " attempts");
            }
        }

        sc.close();
    }
}