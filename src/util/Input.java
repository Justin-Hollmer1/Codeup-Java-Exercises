package util;
import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    public static String getString() {
        return scanner.nextLine();
    }

    public static int getInt(int min, int max) {
        System.out.printf("Please enter a number between %s and %s", min, max);
        int userNumber = scanner.nextInt();
        if (userNumber <= min || userNumber >= max) {
            getInt(min, max);
        }
        return userNumber;
    }

//    public static int getInt() {
//        return scanner.nextInt();
//    }

    public static int getInt() {
        System.out.println("Please enter an integer");
        String thisString = getString();
        try {
            int thisInt = Integer.parseInt(thisString);
            System.out.println("Your integer is " + thisInt + ".");
            return thisInt;
        } catch (Exception e) {
            System.out.println(thisString + " is not an integer.");
//            System.out.println(e);
            return getInt();
        }
    }

    public static double getDouble(int min, int max) {
        System.out.printf("Please enter a number between %s and %s", min, max);
        scanner.nextLine();
        double userNumber = scanner.nextDouble();
        if (userNumber <= min || userNumber >= max) {
            getDouble(min, max);
        }
        return userNumber;
    }

//    public static double getDouble() {
//        return scanner.nextDouble();
//    }
    public static double getDouble() {
        System.out.println("Please enter a double.");
        String thisString = getString();
        try {
            double thisIsADouble = Double.parseDouble(thisString);
            System.out.println("Okay, " + thisIsADouble + " is your double.");
            return thisIsADouble;
        } catch (Exception e) {
            System.out.println("That is not a double.");
            return getDouble();
        }
    }

    public static boolean yesNo() {
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(getInt());
    }

}
