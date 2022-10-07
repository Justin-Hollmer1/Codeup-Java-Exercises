public class Person {

    protected String name = "Before the switch";
    private int age;

    public int getAge() {
        // ERROR!
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}