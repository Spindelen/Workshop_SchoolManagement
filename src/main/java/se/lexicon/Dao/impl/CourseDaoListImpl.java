package se.lexicon.Dao.impl;

import se.lexicon.Dao.IcourseDao;
import se.lexicon.model.Course;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CourseDaoListImpl implements IcourseDao {
    private static List<Course> courseList = new ArrayList<>();

    @Override
    public Course saveCourse(Course course) {
        if (course == null) {
            throw new IllegalArgumentException(">NB:< Course cannot be null.");
        }
        courseList.add(course);
        return course;
    }

    @Override
    public Course findById(String id) {
        for (Course course : courseList) {
            if (course.getId().equals(id)) {
                return course;
            }
        }

        return null;
    }

    @Override
    public List<Course> findByName(String name) {
        List<Course> foundCourse = new ArrayList<>();
        for (Course course : courseList) {
            if (course.getCourseName().equalsIgnoreCase(name)) {
                foundCourse.add(course);
            }
        }

        return foundCourse;
    }

    @Override
    public List<Course> findByDate(LocalDate date) {
        List<Course> foundCourse = new ArrayList<>();
        for (Course course : courseList) {
            if (course.getStartDate().equals(date)) {
                foundCourse.add(course);
            }
        }

        return foundCourse;
    }

    @Override
    public List<Course> findAll() {
        return courseList;
    }

    @Override
    public boolean removeCourse(Course course) {
        return courseList.remove(course);
    }
}

