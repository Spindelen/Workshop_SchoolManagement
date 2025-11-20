package se.lexicon.Dao.impl;

import se.lexicon.Dao.IstudentDao;
import se.lexicon.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoListImpl implements IstudentDao {
    private static List<Student> students= new ArrayList<>();

    @Override
    public Student saveStudent(Student student) {
        if(students==null){
            throw new RuntimeException(">NB:< Student cannot be null.");
        }
        students.add(student);
        return student;
    }

    @Override
    public Student findByEmail(String email) {
     for (Student student : students) {
            if (student.getEmail().equalsIgnoreCase(email)) {
                return student;
            }
        }
        return null;
    }

    @Override
    public List<Student> findByName(String name) {
        List<Student> foundStudent = new ArrayList<>();
        for (Student student : students){
            if (student.getName().equalsIgnoreCase(name)){
                foundStudent.add(student);
            }
        }
       return foundStudent;
    }

    @Override
    public Student findById(String id) {
        for (Student student : students){
            if (student.getId().equals(id)){
                return student;
            }
        }
        return null;
    }


    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public boolean deleteStudent(Student student) {
        return students.remove(student);
    }

}
