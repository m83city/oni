package com.example.application;

import com.example.domain.Student;
import com.example.usecase.StudentCreateUseCase;
import org.springframework.stereotype.Service;

@Service
public class StudentCreateUseCaseImpl  implements StudentCreateUseCase {

    @Override
    public Student execute(Student student) {
        return null;
    }
}
