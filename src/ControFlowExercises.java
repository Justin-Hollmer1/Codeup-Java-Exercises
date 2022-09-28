import java.util.Scanner;

public class ControFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to enter your grade here? (y/n): ");
        String userInput = scanner.next();
        scanner.nextLine();
        if (userInput.equals("y")) {

            System.out.print("Please enter your grade here: ");
            int userGrade = scanner.nextInt();
            if (userGrade >= 95 && userGrade <= 100) {
                System.out.println("A+");
            }
            else if (userGrade >= 90 && userGrade <= 94){
                System.out.println("A-");
            }
            else if (userGrade >= 85 && userGrade <= 89){
                System.out.println("B+");
            }
            else if (userGrade >= 80 && userGrade <= 84){
                System.out.println("B-");
            }
            else if (userGrade >= 75 && userGrade <= 79){
                System.out.println("C+");
            }
            else if (userGrade >= 70 && userGrade <= 74){
                System.out.println("C-");
            }
            else {
                System.out.println("You failed.");
            }
        }
        else {
            System.out.println("Aight then");
        }

    }
}
