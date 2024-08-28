package com.example.controller;

import com.example.domain.Student;
import com.example.dto.StudentDTO;
import com.example.mapper.StudentDtoMapper;
import com.example.usecase.student.StudentCreateUseCase;
import com.example.usecase.student.StudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentUseCase studentUseCase;

    private final StudentCreateUseCase studentCreateUseCase;

    private final StudentDtoMapper studentDtoMapper;


    @GetMapping("/v1/student")
    public void get() {
        studentUseCase.execute();
    }

    @PostMapping("/student")
    public Student create(@RequestBody StudentDTO studentDTO) {
        Student toStudentDto = studentDtoMapper.asStudent(studentDTO);
        return studentCreateUseCase.create(toStudentDto);

    }
}