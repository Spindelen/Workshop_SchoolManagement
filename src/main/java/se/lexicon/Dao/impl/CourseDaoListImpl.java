package se.lexicon.Dao.impl;

import se.lexicon.Dao.IcourseDao;
import se.lexicon.model.Course;

import java.time.LocalDate;
import java.util.List;

public class CourseDaoListImpl implements IcourseDao {
    private static List<Course> courses;

    @Override
    public Course saveCourse(Course course) {
        return null;
    }

    @Override
    public Course findById(int id) {
        return null;
    }

    @Override
    public List<Course> findByName(String name) {
        return List.of();
    }

    @Override
    public List<Course> findByDate(LocalDate date) {
        return List.of();
    }

    @Override
    public List<Course> findAll() {
        return List.of();
    }

    @Override
    public boolean removeCourse(Course course) {
        return false;
    }

    @Override
    public String toString() {
        return "CourseDaoListImpl{}";
    }
}
