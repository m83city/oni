package com.example.mapper;

import com.example.domain.Student;
import com.example.entity.StudentEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapperRepo {
    StudentEntity studentToStudentEntity(Student student);

    Student studentEntitytoStudent(StudentEntity studentEntity);
}
