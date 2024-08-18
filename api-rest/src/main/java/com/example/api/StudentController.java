package com.example.api;

import com.example.domain.Student;
import com.example.usecase.StudentCreateUseCase;
import com.example.usecase.StudentUseCase;
import lombok.NoArgsConstructor;
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

//    public StudentController(
//            StudenUseCase studenUseCase,
//            StudentCreateUseCase studentCreateUseCase) {
//        this.studenUseCase = studenUseCase;
//        this.studentCreateUseCase = studentCreateUseCase;
//    }

    @GetMapping("/student")
    public void get() {
        studentUseCase.execute();
    }

    @PostMapping("/student")
    public Student create(@RequestBody Student student) {
        return studentCreateUseCase.execute(student);
    }
}