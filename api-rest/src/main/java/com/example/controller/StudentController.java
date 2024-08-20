package com.example.controller;

import com.example.domain.Student;
import com.example.dto.StudentDTO;
import com.example.usecase.student.StudentCreateUseCase;
import com.example.usecase.student.StudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static com.example.mapper.StudentMapper.asStudent;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentUseCase studentUseCase;

    private final StudentCreateUseCase studentCreateUseCase;


    @GetMapping("/student")
    public void get() {
        studentUseCase.execute();
    }

    @PostMapping("/student")
    public Student create(@RequestBody StudentDTO studentDTO) {
        //return studentCreateUseCase.create(asStudent(studentDTO));
       // System.out.println(studentCreateUseCase.create(asStudent(studentDTO)).toString());
        return studentCreateUseCase.create(asStudent(studentDTO));

    }
}