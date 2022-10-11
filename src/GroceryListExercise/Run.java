package GroceryListExercise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        //This is the category list
        ArrayList<String> list = new ArrayList<>();
        list.add("Meat");
        list.add("Dairy");
        list.add("Canned Goods");
        list.add("Cleaning");
        list.add("Cookware");
        list.add("Produce");
        list.add("Condiments");

        //Initalizing a list for all of the grocery items.
        HashMap<GroceryItem, Integer> groceryList = new HashMap<GroceryItem, Integer>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to enter a grocery list? Please enter \"yes\" to continue.");
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y")) {
            System.out.println("Would you like to add a new item?");
            String userEnterItem = scanner.nextLine();
            if (userEnterItem.equalsIgnoreCase("yes") || userEnterItem.equalsIgnoreCase("y")) {
                System.out.printf("Please select the items catagory: %s", list);
                System.out.println();
                String userItemType = scanner.nextLine();
                if (!list.contains(userItemType)) {
                    System.out.println("Please enter a valid item type.");
                }

                System.out.println("Please enter the name of the item: ");
                String userItemName = scanner.nextLine();

                System.out.println("Please enter the amount you'd like to add.");
                int userItemAmount = scanner.nextInt();

                GroceryItem userItem = new GroceryItem(userItemName, userItemType);
                groceryList.put(userItem, userItemAmount);
                System.out.printf("%s - %s", userItemName, userItemAmount);
            }
        }
        System.out.println();
        System.out.println("Thank you!");
    }
}
