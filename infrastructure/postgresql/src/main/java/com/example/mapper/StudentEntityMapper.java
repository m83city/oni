package com.example.mapper;

import com.example.domain.Student;
import com.example.entity.StudentEntity;

public class StudentEntityMapper {
    public static Student asStudent(StudentEntity studentEntity) {
        return Student.builder()
                .id(studentEntity.getId())
                .name(studentEntity.getName())
                .secondName(studentEntity.getSecondName())
                .age(studentEntity.getAge())
                .course(studentEntity.getCourse())
                .build();
    }

    public static StudentEntity asStudentEntity(Student student) {
        return StudentEntity.builder()
                .id(student.getId())
                .name(student.getName())
                .secondName(student.getSecondName())
                .age(student.getAge())
                .course(student.getCourse())
                .build();
    }
}
