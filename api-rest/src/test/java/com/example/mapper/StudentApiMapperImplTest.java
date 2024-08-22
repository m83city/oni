package com.example.mapper;

import com.example.domain.Student;
import com.example.dto.StudentDTO;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

class StudentApiMapperImplTest {

    private StudentApiMapper studentApiMapper = Mappers.getMapper(StudentApiMapper.class);

    @Test
    void givenStudent_whenAsStudentDTO_thenStudentDTO(){

       final Student student = this.givenStudent();

       final StudentDTO studentDTO = givenStudentDTO();

       final StudentDTO actual  = this.studentApiMapper.astudentDTO(student);

       assertThat(actual).isEqualTo(studentDTO);

    }

    @Test
    void givenStudentDTO_whenAsStudent_thenStudent(){

        final Student student = this.givenStudent();

        final StudentDTO studentDTO = this.givenStudentDTO();

        final Student actual = this.studentApiMapper.asStudent(studentDTO);


        assertThat(actual).isEqualTo(student);
    }

    private Student givenStudent () {
        return Student.builder()
                .id(1L)
                .age(3)
                .name("Edvard")
                .secondName("Kolinsky")
                .course(3)
                .build();
    }

    private StudentDTO givenStudentDTO () {
        return StudentDTO.builder()
                .id(1L)
                .age(3)
                .name("Edvard")
                .secondName("Kolinsky")
                .course(3)
                .build();
    }
}
