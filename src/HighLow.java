import java.util.Scanner;
import java.lang.Math;

public class HighLow {
    public static void main(String[] args) {
        playGame();
    }

    public static void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 100.");
        int actualNumber = (int)(Math.random()*100 + 1);
        int userGuesses = 10;
        boolean loop = true;
        while (loop == true) {
            if (userGuesses == 0) {
                System.out.println("Game over, would you like to start over? If yes press \"y\".");
                scanner.nextLine();
                String playAgain = scanner.nextLine();
                if (playAgain.equalsIgnoreCase("y")) {
                    playGame();
                }
                else {
                    System.exit(0);
                }
            }
            int userInput = scanner.nextInt();
            while (userInput > 100 || userInput < 1) {
                System.out.println("Please enter a number between 1 and 100.");
                userInput = scanner.nextInt();
            }
            if (userInput == actualNumber) {
                System.out.println("Correct!");
                System.out.println("Would you like to go again? Press \"y\" to go again.");
                scanner.nextLine();
                String playAgain = scanner.nextLine();
                if (playAgain.equalsIgnoreCase("y")) {
                    playGame();
                }
                else {
                    System.exit(0);
                }
            }
            else if (userInput > actualNumber) {
                System.out.println("LOWER!");
                userGuesses -= 1;
                System.out.format("%s guesses remaining", userGuesses);
                System.out.println();
            }
            else if (userInput < actualNumber) {
                System.out.println("HIGHER!");
                userGuesses -= 1;
                System.out.format("%s guesses remaining", userGuesses);
                System.out.println();
            }
        }
    }
}
