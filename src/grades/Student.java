package grades;

import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;


public class Student {
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    // Constructor with 2 arguements.
    public Student(String name, ArrayList<Integer> grade) {
        this.name = name;
        this.grades = grade;
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }
    public double getGradeAverage() {
        double total = 0;
        for (int i = 0; i < this.grades.size(); i++) {
            total += grades.get(i);
        }
        return (total/grades.size());
    }

    public static void main(String[] args) {
        Student student = new Student("Justin", new ArrayList<Integer>());
        student.grades.add(80);
        student.grades.add(90);
        student.grades.add(100);
        System.out.println(student.grades);
        System.out.println(student.getGradeAverage());
    }
}
