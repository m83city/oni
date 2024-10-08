package com.example.controller;

import com.example.domain.Student;
import com.example.dto.StudentDTO;
import com.example.mapper.StudentDtoMapper;
import com.example.usecase.student.CreateStudentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final CreateStudentUseCase createStudentUseCase;

    private final StudentDtoMapper studentDtoMapper;

    @PostMapping("/v1/student")
    public Student create(@RequestBody final StudentDTO studentDTO) {
        final Student toStudentDto = studentDtoMapper.asStudent(studentDTO);
        return createStudentUseCase.execute(toStudentDto);

    }

}