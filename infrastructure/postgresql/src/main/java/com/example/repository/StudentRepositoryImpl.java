package com.example.repository;

import com.example.domain.Student;
import com.example.entity.StudentEntity;
import com.example.jpa.StudentJPARepository;
import com.example.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import static com.example.mapper.StudentEntityMapper.asStudent;
import static com.example.mapper.StudentEntityMapper.asStudentEntity;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {

    private final StudentJPARepository studentJPARepository;

    @Override
    public Student create(Student student) {
       // studentJPARepository.save(student);
        StudentEntity studentEntity = asStudentEntity(student);
        Student studentResponse = asStudent(studentJPARepository.save(studentEntity));
        return studentResponse;
    }
}
