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
    public Student execute(Student student) {
        studentCreatePostgresUseCase.create(student);
        return null;
    }

}
