package com.example.repository;

import com.example.domain.Student;
import com.example.jpa.StudentJPARepository;
import com.example.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {

    private final StudentJPARepository studentJPARepository;

    @Override
    public Student create(Student student) {
       // studentJPARepository.save(student);
        return null;
    }
}
