package com.example.application;

import com.example.usecase.StudenUseCase;
import org.springframework.stereotype.Service;

@Service
public class StudentUseCaseImpl implements StudenUseCase {

    @Override
    public void execute() {
        System.out.println("HELLO WORLD!!!");
    }
}
