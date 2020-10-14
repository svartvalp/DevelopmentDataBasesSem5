package com.svartvalp.devdbprac3;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao;


    @Override
    public void createOrUpdateStudent(Student student) {
        studentDao.save(student);
    }

    @Override
    public void deleteStudentById(String id) {
        studentDao.deleteById(id);
    }

    @Override
    public Optional<Student> getStudentById(String id) {
        return studentDao.findById(id);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentDao.findAll();
    }
}
