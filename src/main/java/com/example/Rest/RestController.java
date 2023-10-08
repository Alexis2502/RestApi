package com.example.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping
public class RestController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> getStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable final Integer id) throws ResourceNotFoundException{
        return studentService.getStudentById(id);
    }

    @PostMapping("/students")
    public Student postStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return student;
    }

    @PutMapping("/students/{id}")
    public Student putStudent(@RequestBody Student student,@PathVariable final Integer id){
        studentService.updateStudent(id,student);
        return studentService.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable final Integer id){
        studentService.deleteStudent(id);
    }
}
