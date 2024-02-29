import java.util.Scanner;
import java.util.Random;

public class guess_a_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        playGame(scanner, random);
        scanner.close();
    }

    public static void playGame(Scanner scanner, Random random) {
        int rounds = 0;
        int score = 0;

        while (true) {
            rounds++;
            System.out.println("\nRound " + rounds);
            if (playRound(scanner, random)) {
                score++;
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            if (!playAgain.toLowerCase().startsWith("y")) {
                break;
            }
        }

        System.out.println("Thanks for playing!");
        System.out.println("Your score: " + score + " rounds won.");
    }

    public static boolean playRound(Scanner scanner, Random random) {
        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        final int maxAttempts = 5;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess (between 1 and 100): ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == secretNumber) {
                System.out.println("Congratulations! You've guessed the correct number: " + secretNumber);
                return true;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            System.out.println("Attempts left: " + (maxAttempts - attempts));
        }

        System.out.println("Sorry, you've run out of attempts. The correct number was: " + secretNumber);
        return false;
    }
}
