import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int numberToGuess = random.nextInt(100) + 1;
        int numberOfTries = 0;
        int guess = 0;
        boolean win = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have randomly chosen a number between 1 and 100.");
        System.out.println("Try to guess it.");
        
        while (!win) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfTries++;
            
            if (guess < 1 || guess > 100) {
                System.out.println("Your guess is out of range. Please choose a number between 1 and 100.");
            } else if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                win = true;
                System.out.println("Congratulations! You guessed the number correctly.");
                System.out.println("It took you " + numberOfTries + " tries.");
            }
        }
        
        scanner.close();
    }
}
