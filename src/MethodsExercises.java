import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        recurse();
        doTheThing();
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





}
