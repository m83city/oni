package com.example.repository;

import com.example.domain.Student;
import com.example.entity.StudentEntity;
import com.example.jpa.StudentJPARepository;
import com.example.mapper.StudentMapperRepo;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentRepository {

    private final StudentJPARepository studentJPARepository;

    private final StudentMapperRepo studentMapperRepo;

    @Override
    public Student create(Student student) {

        StudentEntity studentEntity = studentMapperRepo.asStudentEntity(student);
        Student studentResponse = studentMapperRepo.asStudent(studentJPARepository.save(studentEntity));
        return studentResponse;
    }
}
