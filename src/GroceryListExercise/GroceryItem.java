package GroceryListExercise;

public class GroceryItem {
    private String name;
    private String catagory;

    public GroceryItem(String name, String catagory) {
        this.name = name;
        this.catagory = catagory;
    }

    //Getters and setters for each of the properties.
    public String getName() {
        return this.name;
    }
    public String getCatagory() {
        return this.catagory;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }


}
