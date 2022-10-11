package grades;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {

        Student student = new Student("Justin", new ArrayList<Integer>());
        student.addGrade(90);
        student.addGrade(100);
        student.addGrade(95);
        student.addGrade(96);
        student.addGrade(97);
        System.out.println(student.getGrades());
        System.out.println(student.getGradeAverage());









    }
}
