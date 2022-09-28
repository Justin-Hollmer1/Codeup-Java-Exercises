import java.util.Scanner;

public class ControFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Going to enter a table of numbers, what would you like the table to go up to: ");
        int userInput = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println("Number | Squared | Cubed");
        System.out.println("------ | ------- | -----");

        for (int i = 1; i <= userInput; i++) {
            String numberString = "";
            String squaredString = "";
            int cubedString = i*i*i;
            int numberField = i;
            int squaredField = i*i;
            int cubedField = i*i*i;
            if (numberField < 10) {
                numberString = numberField+"      | ";
            }
            else if (numberField < 100) {
                numberString = numberField+"     | ";
            }
            if (squaredField < 10) {
                squaredString = squaredField+"       | ";
            }
            else if (squaredField < 100) {
                squaredString = squaredField+"      | ";
            }
            else if (squaredField < 1000) {
                squaredString = squaredField+"     | ";
            }
            else if (squaredField < 10000) {
                squaredString = squaredField+"    | ";
            }
            else if (squaredField < 100000) {
                squaredString = squaredField+"   | ";
            }
            else if (squaredField < 1000000) {
                squaredString = squaredField+"  | ";
            }
            else if (squaredField < 10000000) {
                squaredString = squaredField+" | ";
            }

            System.out.println(numberString + squaredString + cubedString);
        }

    }
}
