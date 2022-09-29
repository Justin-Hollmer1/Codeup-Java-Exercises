import java.util.Scanner;

public class StringExercise {
    public static void main(String[] args) {
        String education = "We don't need no education";
        System.out.println(education);

        String nextString = education.replace("education", "thought control");
        System.out.println(nextString);

        String string1 = "Check \"this\" out!, \"s inside of \"s!";
        System.out.println(string1);

        String string2 = "In windows, the main drive is usually C:\\";
        System.out.println(string2);

        String string3 = "I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\!";
        System.out.println(string3);

        class Bob {
            void response(String input) {
                if (input.endsWith("?")) {
                    System.out.println("Sure.");
                }
                else if (input.endsWith("!")) {
                    System.out.println("Woah, chill out!");
                }
                else if (input.equals("")) {
                    System.out.println("Fine. By the way!");
                }
                else {
                    System.out.println("Whatever.");
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        Bob bobInstance = new Bob();
        int number = 1;
        while (number != 0) {
            System.out.println("Have a conversation with Bob, press 9 to stop talking.");
            String userInput = scanner.nextLine();
            if (userInput.equals("9")) {
                break;
            }
            bobInstance.response(userInput);
        }
    }
}
