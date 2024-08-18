package com.example.application;

import com.example.usecase.StudentUseCase;
import org.springframework.stereotype.Service;

@Service
public class StudentUseCaseImpl implements StudentUseCase {

    @Override
    public void execute() {
        System.out.println("HELLO WORLD!!!");
    }
}
