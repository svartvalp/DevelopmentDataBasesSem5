package com.svartvalp.devdbprac3;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/student")
public class StudentController {
    private final StudentService studentService;


    @GetMapping(value = "/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(value = "")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PutMapping(value = "")
    public void updateStudent(@RequestBody Student student) {
        studentService.createOrUpdateStudent(student);
    }

    @PostMapping(value = "")
    public void createStudent(@RequestBody Student student){
        studentService.createOrUpdateStudent(student);
    }

    @DeleteMapping(value = "/{id}")
    public void deleteStudent(@PathVariable("id") String id) {
        studentService.deleteStudentById(id);
    }

}
