package com.example.StudentDL;

import com.example.StudentDL.Entities.Student;
import com.example.StudentDL.Repository.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class StudentDlApplicationTests {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void createStutudent() {
        Student student = new Student();
        student.setName("Petra");
        student.setCourse("Java for beginners");
        student.setFee(100.0);
        studentRepository.save(student);
    }

    @Test
    public void findStudentWithId(){
        Optional<Student> st = studentRepository.findById(1L);
        System.out.println(st);
    }
@Test
    public void updateStudentWithId(){
        Student st = studentRepository.findById(1L).get();
       st.setFee(40.0);
       studentRepository.save(st);
    }
}
