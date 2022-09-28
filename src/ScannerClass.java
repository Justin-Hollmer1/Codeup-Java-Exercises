import java.util.Scanner;
public class ScannerClass {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("Pi with only 2 decimal places is %.2f.%n", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String userInput = scanner.nextLine();
        System.out.println(userInput);


        System.out.print("Please enter the x length of the room: ");
        String xValue = scanner.nextLine();
        System.out.print("Please enter the y length of the room: ");
        String yValue = scanner.nextLine();
        System.out.print("Please enter the z length of the room: ");
        String zValue = scanner.nextLine();
        System.out.println("The area of the room is: " + (Integer.parseInt(xValue) * Integer.parseInt(yValue)) + " feet squared.");
        System.out.println("The perimeter of the room is: " + ((Integer.parseInt(xValue) * 2) + (Integer.parseInt(yValue)) * 2) + " feet.");
        System.out.println("The volume of the room is: " +  + (Integer.parseInt(xValue) * Integer.parseInt(yValue) * Integer.parseInt(zValue)) + " feet cubed.");








    }
}
