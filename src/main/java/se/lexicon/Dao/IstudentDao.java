package se.lexicon.Dao;

import se.lexicon.model.Student;

import java.util.List;

public interface IstudentDao {
    Student saveStudent(Student student);
    Student findByEmail(String email);
    List<Student> findByName(String name);
    Student findById(String id);
    List<Student> findAll();
    boolean deleteStudent(Student student);

}
