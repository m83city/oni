package com.example.controller;

import com.example.usecase.student.StudentCreateUseCase;
import com.example.usecase.student.StudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentUseCase studentUseCase;

    private final StudentCreateUseCase studentCreateUseCase;


    @GetMapping("/student")
    public void get() {
        studentUseCase.execute();
    }

//    @PostMapping("/student")
//    public Student create(@RequestBody StudentDTO studentDTO) {
//        return studentCreateUseCase.create(asStudent(studentDTO));
//    }
}