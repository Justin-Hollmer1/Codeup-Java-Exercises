import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Have a conversation with Bob, press 9 to stop the conversation.");
        while (number != 0) {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            if (userInput.equals("9")) {
                break;
            }
            else if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            }
            else if (userInput.endsWith("!")) {
                System.out.println("Woah, chill out!");
            }
            else if (userInput.equals("")) {
                System.out.println("Fine. By the way!");
            }
            else {
                System.out.println("Whatever.");
            }
            System.out.println("");
        }
        System.out.println("Great conversation.");
    }
}
