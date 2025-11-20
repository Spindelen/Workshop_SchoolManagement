package se.lexicon.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    private Student student;

    @BeforeEach
    void setUp() {
    student =new Student("Jan","Jan@test.test","Milky way, Tellus, Terra");
    //student =new Student2("Erik","erik@test.test","Milky way, Tellus, Terra");
    }

    @Test
    void testEquals() {

    }

    @Test
    void testHashCode() {
    }

    @Test
    void testToString() {
    }
}