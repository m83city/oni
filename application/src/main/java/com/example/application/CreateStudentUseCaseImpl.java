package com.example.application;

import com.example.domain.Student;
import com.example.repository.StudentRepository;
import com.example.usecase.student.CreateStudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateStudentUseCaseImpl implements CreateStudentUseCase {

    private final StudentRepository studentRepository;

    @Override
    public Student execute(final Student student) {
        return studentRepository.create(student);
    }
}
