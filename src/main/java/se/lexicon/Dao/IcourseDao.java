package se.lexicon.Dao;

import se.lexicon.model.Course;

import java.time.LocalDate;
import java.util.List;

public interface IcourseDao {
    Course saveCourse(Course course);
    Course findById(String id);
    List<Course> findByName(String name);
    List<Course> findByDate(LocalDate date);
    List<Course> findAll();
    boolean removeCourse(Course course);
}
