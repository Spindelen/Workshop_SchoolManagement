package se.lexicon.Dao.impl;

import se.lexicon.Dao.IstudentDao;
import se.lexicon.model.Student;

import java.util.List;

public class StudentDaoListImpl implements IstudentDao {
    private static List<Student> students;

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        return List.of();
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<Student> findAll() {
        return List.of();
    }

    @Override
    public boolean deleteStudent(Student student) {
        return false;
    }

    @Override
    public String toString() {
        return "StudentDaoListImpl{}";
    }
}
