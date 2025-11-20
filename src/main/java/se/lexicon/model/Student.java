package se.lexicon.model;


import java.util.Objects;

public class Student {
    private static int counter = 0;
    private String id;
    private String name;
    private String email;
    private String address;

    public Student(String name, String email, String address) {
        this.id = "P" + (++counter);
       setName(name);
       setEmail(email);
       setAddress(address);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException(">NB:< Name must be null or empty.");
        }
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email == null || email.isEmpty()){
            throw new IllegalArgumentException(">NB:< E-mail must be null or empty.");
        }
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null|| address.isEmpty()){
            throw new IllegalArgumentException(">NB:< Address must be null or empty.");
        }
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
