package GroceryListExercise;

import javax.print.MultiDocPrintService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> categoryList = new ArrayList<String>();
        categoryList.add("Meat");
        categoryList.add("Dairy");
        categoryList.add("Produce");
        categoryList.add("Cleaning Supplies");
        categoryList.add("Pet Supplies");
        categoryList.add("Canned Goods");
        categoryList.add("Condiments");
        categoryList.add("Frozen Things");
        ArrayList<String> groceryItemsList = new ArrayList<>();
        HashMap<String, GroceryItem> groceryList = new HashMap<>();


        //Asking user if they want to use the program.
            System.out.println("Would you like to create a grocery list?");
            String playGame = scanner.nextLine();
            //If they want to use the program, use it, if not, break out of the loop.
            if (playGame.equalsIgnoreCase("yes") || playGame.equalsIgnoreCase("y")) {
                int value = 0;
                while (value != 1) {

                    // Asking user if they want to enter a grocery item
                    System.out.println("Would you like to enter a grocery item?");
                    String enterItemStatus = scanner.nextLine();

                    if (enterItemStatus.equalsIgnoreCase("yes") || enterItemStatus.equalsIgnoreCase("y")) {
                        System.out.println("Here is a list of all of the categories to choose from");
                        for (int i = 0; i < categoryList.size(); i++) {
                            System.out.println(categoryList.get(i));
                        }
                        System.out.println("Please choose one of the categories.");
                        String userEnteredItemCategory = scanner.nextLine();
                        System.out.println("Please enter the item name: ");
                        String userEnteredItemName = scanner.nextLine();
                        System.out.println("Please enter how many you would like to buy: ");
                        int userEnteredItemAmount = scanner.nextInt();
                        GroceryItem itemObject = new GroceryItem(userEnteredItemName, userEnteredItemAmount, userEnteredItemCategory);
                        // Add this to the hashmap.
                        groceryItemsList.add(userEnteredItemName);
                        groceryList.put(userEnteredItemName, itemObject);
                        scanner.nextLine();


                        //At this point all of the parts that the user entered has been put into the hashmap.
                    }
                    else {
                        System.out.println("Finalizing the list");
                        System.out.println("Your entire List:");
                        System.out.println("Name --- Quantity --- Category");
                        System.out.println("----------------------");
                        for (int i = 0; i < groceryList.size(); i++) {
                            System.out.printf("Item %s: %s --- %s --- %s", (i + 1), groceryItemsList.get(i), groceryList.get(groceryItemsList.get(i)).getQuantity(), groceryList.get(groceryItemsList.get(i)).getCatagory());
                            System.out.println();
                        }

                        value += 1;
                    }
                }
            }
        System.out.println("Thank you!");
    }
}
