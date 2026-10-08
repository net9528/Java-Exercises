import java.util.Random;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        char playAgain = 'Y';

        System.out.println("Guess My Number Game");

        while (playAgain == 'Y' || playAgain == 'y') {

            // Generate random number between 1 and 6
            int randomNumber = random.nextInt(6) + 1;

            int guess;
            int attempts = 0;

            do {

                System.out.print("Enter a guess between 1 and 6: ");
                guess = input.nextInt();

                attempts++;

                if (guess > randomNumber) {
                    System.out.println(
                        "Too high! The random number is " + randomNumber
                    );
                }
                else if (guess < randomNumber) {
                    System.out.println(
                        "Too low! The random number is " + randomNumber
                    );
                }
                else {
                    System.out.println(
                        "Correct! You got it in " + attempts + " guesses!"
                    );
                }

            } while (guess != randomNumber);

            System.out.print("Do you want to play (Y or N)? ");
            playAgain = input.next().charAt(0);
        }

        System.out.println("Thanks for playing!");

        input.close();
    }
}