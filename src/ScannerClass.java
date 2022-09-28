import java.util.Scanner;
public class ScannerClass {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("Pi with only 2 decimal places is %.2f.%n", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String userInput = scanner.nextLine();
        System.out.println(userInput);


        System.out.print("Please enter the x coordinate of the room: ");
        String xValue = scanner.nextLine();
        System.out.println("");
        System.out.print("Please enter the y coordinate of the room: ");
        String yValue = scanner.nextLine();
        System.out.println("The area of the room is: " + (Integer.parseInt(xValue) * Integer.parseInt(yValue)) + " feet squared");
        System.out.println("The perimeter of the room is: " + ((Integer.parseInt(xValue) * 2) + (Integer.parseInt(yValue)) * 2) + " feet");







    }
}
