package com.example.api;

import com.example.usecase.StudenUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private final StudenUseCase studenUseCase;

    public StudentController(StudenUseCase studenUseCase) {
        this.studenUseCase = studenUseCase;
    }

    @GetMapping("/student")
    public void get() {
        studenUseCase.execute();
    }
}