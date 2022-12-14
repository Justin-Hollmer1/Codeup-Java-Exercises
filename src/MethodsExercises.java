import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {
//        recurse();
//        doTheThing();
//        factorial();
        diceRoll();

    }
    public static double add(double input1, double input2) {
        return input1 + input2;
    }
    public static double multiple(double input1, double input2) {
        double returnValue = input1;
        for (int i = 0; i < input2 - 1; i++) {
            returnValue += input1;
        }
        return returnValue;
    }
    public static double subtract(double input1, double input2) {
        return input1 - input2;
    }
    public static double divide(double input1, double input2) {
        return input1 / input2;
    }
    public static double modulus(double input1, double input2) {
        return input1 % input2;
    }
    public static void recurse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 numbers to add");
        double add1 = scanner.nextDouble();
        double add2 = scanner.nextDouble();
        System.out.println(add(add1, add2));
        System.out.println("Please enter 2 numbers to multiply");
        double mult1 = scanner.nextDouble();
        double mult2 = scanner.nextDouble();
        System.out.println(multiple(mult1, mult2));
        System.out.println("Please enter 2 numbers to subtract");
        double sub1 = scanner.nextDouble();
        double sub2 = scanner.nextDouble();
        System.out.println(subtract(sub1, sub2));
        System.out.println("Please enter 2 numbers to divide");
        double div1 = scanner.nextDouble();
        double div2 = scanner.nextDouble();
        System.out.println(divide(div1, div2));
        System.out.println("Would you like to run the program again? If yes please enter \"y\".");
        scanner.nextLine();
        String goAgain = scanner.nextLine();
        if (goAgain.equalsIgnoreCase("y")) {
            recurse();
        }
        else {
            System.exit(0);
        }
    }
    public static void doTheThing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 10: ");
        int userInput = scanner.nextInt();
        if (userInput > 10 || userInput < 1) {
            System.out.println("Invalid input");
            doTheThing();
        }
        else {
            System.out.println("Thank you");
            System.exit(0);
        }
    }
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 and 20 to get the factorial of that number.");
        int userInput = scanner.nextInt();
        if (userInput < 1 || userInput > 20) {
            System.out.println("Invalid input");
            factorial();
        }

        System.out.println(factorialCalculation(userInput));
        System.out.println("Would you like to enter another number? Enter \"y\" to go again.");
        scanner.nextLine();
        String goAgain = scanner.nextLine();
        if (goAgain.equalsIgnoreCase("y")) {
            factorial();
        }
        else {
            System.exit(0);
        }
    }
    public static long factorialCalculation(int input) {
        long total = input;
        for (int i = 1; i < input; i++) {
            total *= i;
        }
        return total;
    }
    public static void diceRoll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the nubmer of sides for the dices.");
        System.out.print("Dice 1 sides: ");
        int diceSides1 = scanner.nextInt();
        System.out.print("Dice 2 sides: ");
        int diceSides2 = scanner.nextInt();
        System.out.println("Would you like to roll the dice? Enter \"y\" to roll.");
        scanner.nextLine();
        String userAnswer = scanner.nextLine();
        if (userAnswer.equalsIgnoreCase("y")) {
            System.out.format("Dice roll 1 = %s", theRoll(diceSides1));
            System.out.println();
            System.out.format("Dice roll 2 = %s", theRoll(diceSides2));
            System.out.println();
        }
        else {
            System.exit(0);
        }
        System.out.println("Would you like to start again? To go again press \"y\".");
        String playAgain = scanner.nextLine();
        if (playAgain.equalsIgnoreCase("y")) {
            diceRoll();
        }
        else {
            System.exit(0);
        }

    }
    public static int theRoll(int input) {
        int random = (int)((Math.random()*input) + 1);
        return random;
    }
}
