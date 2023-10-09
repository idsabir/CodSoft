
import java.util.Random;
import java.util.Scanner;
    public class NumberGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int min = 1;
            int max = 100;
            int maxAttempts = 10;
            int score = 0;

            System.out.println("Welcome to the Number Guessing Game : ");
            boolean playAgain = true;

            while (playAgain) {
                int numberToGuess = random.nextInt(max - min + 1) + min;
                int attempts = 0;
                boolean Correct = false;

                System.out.println("I have selected a number between " + min + " and " + max + " ");

                while (attempts < max) {
                    System.out.print("Enter your guess Number: ");
                    int Guess = scanner.nextInt();
                    attempts++;

                    if (Guess == numberToGuess) {
                        System.out.println("You guessed the correct number in " + attempts + " attempts.");
                        Correct = true;
                        break;
                    } else if (Guess < numberToGuess) {
                        System.out.println("Too low try again.");
                    } else {
                        System.out.println("Too high try again.");
                    }
                }

                if (!Correct) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
                } else {
                    score++;
                }

                System.out.print("Do you want to play again? (yes/no): ");
                String playAgainInput = scanner.next().toLowerCase();
                playAgain = playAgainInput.equals("yes");
            }
            System.out.println("Thank you for playing Your total score is: " + score);
        }
    }


