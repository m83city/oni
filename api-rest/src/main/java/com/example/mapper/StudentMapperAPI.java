package com.example.mapper;

import com.example.domain.Student;
import com.example.dto.StudentDTO;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

@Service
@Mapper(componentModel = "spring")
public interface StudentMapperAPI {

    StudentDTO studentToStudentDTO(Student student);

    Student studentDTOtoStudent(StudentDTO studentDTO);
}
