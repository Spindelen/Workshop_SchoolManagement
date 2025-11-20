package se.lexicon.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Course {
    private static int courseCounter = 0;
    private String id;
    private String courseName;
    private LocalDate startDate;
    private int weekDuration;
    private List<Student> students = new ArrayList<>();

    public Course(String courseName, LocalDate startDate, int weekDuration, List<Student> students) {
        this.id = "C" + (++courseCounter);
        setCourseName(courseName);
        setStartDate(startDate);
        setWeekDuration(weekDuration);
        setStudents(students);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName == null || courseName.isEmpty()) {
            throw new IllegalArgumentException(">NB<: CourseName must not be null or empty.");
        } else {
            this.courseName = courseName;
        }
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        if (startDate == null || startDate.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException(">NB:< StartDate must be null or in the past");
        }
        this.startDate = startDate;

    }

    public int getWeekDuration() {
        return weekDuration;
    }

    public void setWeekDuration(int weekDuration) {
        if (weekDuration <= 0) {
            throw new IllegalArgumentException(">NB:< Week duration can't be 0 or negative");
        }
        this.weekDuration = weekDuration;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void register(Student student) {
        if (!students.contains(student)) {
        } else if (student == null) {
            throw new IllegalArgumentException(">NB:< Student cannot be null.");

        }
        students.add(student);
    }


    public void unregister(Student student) {
        if (student == null) {
            throw new IllegalArgumentException(">NB:< Student cannot be null or empty.");
        } else if (!students.contains(student)) {
            throw new RuntimeException(">DB:< Student was not registered!");
        }
        students.remove(student);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return id == course.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("course: ").append(courseName)
                .append("(id=").append(id).append(")\n")
                .append("Start: ").append(startDate)
                .append(", Duration: ").append(weekDuration).append(" weeks\n")
                .append("Students; \n");
        for (Student s : students) {
            sb.append(" ").append(s).append("\n");
        }
        return sb.toString();

    }
}
