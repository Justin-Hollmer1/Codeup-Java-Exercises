package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student AStudent = new Student("Student1", new ArrayList<Integer>());
        Student BStudent = new Student("Student1", new ArrayList<Integer>());
        Student CStudent = new Student("Student1", new ArrayList<Integer>());
        Student DStudent = new Student("Student1", new ArrayList<Integer>());

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(AStudent);
        studentList.add(BStudent);
        studentList.add(CStudent);
        studentList.add(DStudent);

        AStudent.addGrade(95);
        AStudent.addGrade(96);
        AStudent.addGrade(97);

        BStudent.addGrade(88);
        BStudent.addGrade(83);
        BStudent.addGrade(85);

        CStudent.addGrade(75);
        CStudent.addGrade(79);
        CStudent.addGrade(72);

        DStudent.addGrade(50);
        DStudent.addGrade(27);
        DStudent.addGrade(68);

        HashMap<String, Student> students = new HashMap<>();

        students.put("UsernameForAStudent", AStudent);
        students.put("UsernameForBStudent", BStudent);
        students.put("UsernameForCStudent", CStudent);
        students.put("UsernameForDStudent", DStudent);

        int value = 1;
        while (value == 1) {
            System.out.println("Hello");
            System.out.println();
            System.out.println("The github usernames for the students are: ");
            System.out.println();
            System.out.println("|UsernameForAStudent| |UsernameForBStudent| |UsernameForCStudent| |UsernameForDStudent|");
            System.out.println();
            System.out.println("Would you like to see the grades for all of the students?");
            String allGrades = scanner.nextLine();
            if (allGrades.equalsIgnoreCase("yes") || allGrades.equalsIgnoreCase("y")) {
                System.out.println("All grades: ");
                for(int i = 0; i < students.size(); i++) {
                    System.out.printf("Student %s: %s, Average: %s", i, studentList.get(i).getGrades(), studentList.get(i).getGradeAverage());
                    System.out.println();
                }
            }
            else {

            }
            System.out.println("What student would you like to see information on?");
            String userInput = scanner.nextLine();
            int testValue = 0;
            while (testValue != 1) {
                if (!students.containsKey(userInput)) {
                    System.out.println("Please enter valid github username");
                    userInput = scanner.nextLine();
                    continue;
                }
                else {
                    testValue += 1;
                }
            }

            System.out.printf("Name: %s", students.get(userInput).getName());
            System.out.println();
            System.out.printf("GitHub Username: %s", userInput);
            System.out.println();
            System.out.printf("Current grades: %s", students.get(userInput).getGrades());
            System.out.println();
            System.out.printf("Current Grade Average: %s", students.get(userInput).getGradeAverage());
            System.out.println();

            System.out.println("Would you like to run the program again? Please enter \"yes\" or \"no\"");
            String continueOrNot = scanner.nextLine();
            if (continueOrNot.equalsIgnoreCase("no") || continueOrNot.equalsIgnoreCase("n")) {
                value += 1;
            }
        }
        System.out.println("Thank you!");
    }
}
