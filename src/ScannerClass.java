import java.util.Scanner;
public class ScannerClass {

    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("Pi with only 2 decimal places is %.2f.%n", pi);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println(word1+ " " + word2 + " " + word3);

        scanner.nextLine();
        System.out.print("Please enter the x length of the room: ");
        int xValue = scanner.nextInt();
        System.out.print("Please enter the y length of the room: ");
        int yValue = scanner.nextInt();
        System.out.print("Please enter the z length of the room: ");
        int zValue = scanner.nextInt();
        System.out.print("\nThe area of the room is: " + (xValue * yValue) + " feet squared. ");
        System.out.print("The perimeter of the room is: " + (xValue * 2) + (yValue * 2) + " feet. ");
        System.out.print("The volume of the room is: " +  + (xValue * yValue * zValue) + " feet cubed.");


    }
}
