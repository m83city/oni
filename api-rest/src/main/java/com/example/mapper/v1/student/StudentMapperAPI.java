package com.example.mapper.v1.student;

import com.example.domain.Student;
import com.example.dto.StudentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentMapperAPI {

    StudentDTO astudentDTO(Student student);

    Student asStudent(StudentDTO studentDTO);
}
