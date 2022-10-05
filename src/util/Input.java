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

    public static int getInt() {
        return scanner.nextInt();
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

    public static double getDouble() {
        return scanner.nextDouble();
    }

    public static boolean yesNo() {
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("true")) {
            return true;
        }
        return false;
    }

}
