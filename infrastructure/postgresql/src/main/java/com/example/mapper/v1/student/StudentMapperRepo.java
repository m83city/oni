package com.example.mapper.v1.student;

import com.example.domain.Student;
import com.example.entity.StudentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapperRepo {
    StudentEntity asStudentEntity(Student student);

    Student asStudent(StudentEntity studentEntity);
}
