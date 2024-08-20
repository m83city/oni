package com.example.mapper;

import com.example.domain.Student;
import com.example.dto.StudentDTO;

public class StudentMapper {

    public static Student asStudent(StudentDTO studentDTO) {
        return Student.builder()
                .id(studentDTO.getId())
                .name(studentDTO.getName())
                .secondName(studentDTO.getSecondName())
                .age(studentDTO.getAge())
                .course(studentDTO.getCourse())
                .build();
    }

    public static StudentDTO asStudentDTO(Student student) {
        return StudentDTO.builder()
                .id(student.getId())
                .name(student.getName())
                .secondName(student.getSecondName())
                .age(student.getAge())
                .course(student.getCourse())
                .build();
    }
}
