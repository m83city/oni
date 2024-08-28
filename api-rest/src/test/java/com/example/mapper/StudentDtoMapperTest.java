package com.example.mapper;

import com.example.domain.Student;
import com.example.dto.StudentDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
class StudentDtoMapperTest {

    @TestConfiguration
    static class TestContextConfiguration {
        @Bean
        StudentDtoMapper studentDtoMapper () {
            return new StudentDtoMapperImpl();
        }
    }
    @Autowired
    StudentDtoMapper studentDtoMapper;


    @Test
    void givenStudent_whenAsStudentDTO_thenStudentDTO(){
        //given
       final Student student = this.givenStudent();
       final StudentDTO studentDTO = this.givenStudentDTO();


       //when
       final StudentDTO actual  = this.studentDtoMapper.astudentDTO(student);

        //then
       assertThat(actual).isEqualTo(studentDTO);
    }

    @Test
    void givenStudentDTO_whenAsStudent_thenStudent(){
        //given
        final Student student = this.givenStudent();
        final StudentDTO studentDTO = this.givenStudentDTO();

        //when
        final Student actual = this.studentDtoMapper.asStudent(studentDTO);

        //then
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
