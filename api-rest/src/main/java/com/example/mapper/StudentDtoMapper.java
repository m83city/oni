package com.example.mapper;

import com.example.domain.Student;
import com.example.dto.StudentDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentDtoMapper {

    StudentDTO astudentDTO(Student student);

    Student asStudent(StudentDTO studentDTO);
}
