package se.lexicon;

import se.lexicon.model.Course;
import se.lexicon.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan", "Jan@test.test", "Milky way, Tellus, Terra"));
        students.add(new Student("Erik", "erik@test.test", "Milky way, Tellus, Terra"));
        students.add(new Student("Spindelen","Spindelen@test.test", "Milky way, Mars"));

        for (Student s : students){
        System.out.println(s);
    }
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("Programing", LocalDate.of(2025,11,20),8, students));

        for (Course c : courses) {
            System.out.println(c);

        }

}}