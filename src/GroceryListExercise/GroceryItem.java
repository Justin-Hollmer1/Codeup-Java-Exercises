package GroceryListExercise;

public class GroceryItem {
    private String name;
    private int quantity;
    private String catagory;

    public GroceryItem(String name, int quantity, String catagory) {
        this.name = name;
        this.quantity = quantity;
        this.catagory = catagory;
    }

    //Getters and setters for each of the properties.
    public String getName() {
        return this.name;
    }
    public String getCatagory() {
        return this.catagory;
    }
    public int getQuantity() {
        return this.quantity;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }


}
