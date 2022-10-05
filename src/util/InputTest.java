package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Input.getDouble(1, 10);
        Input.getDouble();
        Input.getInt();
        Input.getString();
        Input.yesNo();
        System.out.println("Enter a minimum");
        int min = scanner.nextInt();
        System.out.println("Enter a maximum");
        int max = scanner.nextInt();
        Input.getInt(min, max );


    }
}
