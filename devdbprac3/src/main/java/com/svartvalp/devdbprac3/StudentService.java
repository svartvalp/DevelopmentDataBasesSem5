package com.svartvalp.devdbprac3;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void createOrUpdateStudent(Student student);
    void deleteStudentById(String id);
    Optional<Student> getStudentById(String id);
    List<Student> getAllStudents();
}
