package com.example.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    public void addStudent(Student student){
        studentRepo.save(student);
    }

    public Student getStudentById(Integer id) throws ResourceNotFoundException{
        if(!studentRepo.existsById(id)){
            throw new ResourceNotFoundException(":( Client with id=".concat(String.valueOf(id)).concat(" not found"));
        }else {
            return studentRepo.findById(id).orElseThrow();
        }
    }

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public void deleteStudent(Integer id) {
        studentRepo.deleteById(id);
    }

    public void updateStudent(Integer id,Student student) {
        studentRepo.deleteById(id);
        student.setStudentId(id);
        studentRepo.save(student);
    }
}
