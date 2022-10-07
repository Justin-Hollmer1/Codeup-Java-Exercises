public class Employee extends Person {

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        System.out.println(e.getAge());
        e.setAge(5);
        System.out.println(e.getAge());
        System.out.println("------");
        System.out.println(e.getName());
        e.setName("Testname");
        System.out.println(e.getName());
    }

}
