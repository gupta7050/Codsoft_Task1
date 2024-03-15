import java.util.Scanner;
		import java.util.Random;
public class Task1 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        int lowerBound = 1;
		        int upperBound = 100;
		        int attempts = 0;
		        int totalAttempts = 0;
		        int rounds = 0;

		        System.out.println("Welcome to the Number Guessing Game!");

		        while (true) {
		            int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
		            attempts = 0;
		            System.out.println("Guess the number between " + lowerBound + " and " + upperBound + ": ");

		            while (true) {
		                int userGuess = scanner.nextInt();
		                attempts++;

		                if (userGuess < numberToGuess) {
		                    System.out.println("Too low! Try again.");
		                }
		                else if (userGuess > numberToGuess) {
		                    System.out.println("Too high! Try again.");
		                }
		                else {
		                    System.out.println("Congratulations! You've guessed the number " + numberToGuess + " correctly!");
		                    System.out.println("It took you " + attempts + " attempts.");
		                    totalAttempts += attempts;
		                    rounds++;
		                    break;
		                }
		            }

		            System.out.println("Do you want to play again? (yes/no): ");
		            scanner.nextLine(); 
		            String playAgain = scanner.nextLine().toLowerCase();

		            if (!playAgain.equals("yes")) {
		                System.out.println("Thank you for playing! Your average attempts per round: " + (totalAttempts / rounds));
		                break;
		            }
		        }

		        scanner.close();
		    }
                 

	}


