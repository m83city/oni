package com.example.application;

import com.example.domain.Student;
import com.example.repository.StudentRepository;
import com.example.usecase.student.StudentCreateUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentCreateUseCaseImpl implements StudentCreateUseCase {
    private final StudentRepository studentCreatePostgresUseCase;

    @Override
    public Student create(Student student) {
        return studentCreatePostgresUseCase.create(student);
    }

}
