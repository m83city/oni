package com.example.mapper;

import com.example.domain.Student;
import com.example.entity.StudentEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(SpringExtension.class)
public class StudentEntityMapperTest {

    @TestConfiguration
    static class TestContextConfiguration {
        @Bean
        public StudentEntityMapper studentEntityMapper() {
            return new StudentEntityMapperImpl();
        }
    }

    @Autowired
    StudentEntityMapper studentEntityMapper;


    @Test
    void givenStudent_whenAsStudentEntity_thenStudentEntity() {
        //given
        final StudentEntity studentEntity = givenStudentEntity();
        final Student student = givenStudent();

        //when
        final StudentEntity actual = this.studentEntityMapper.asStudentEntity(student);

        //then
        assertThat(actual).isEqualTo(studentEntity);
    }

    @Test
    void givenStudentEntity_whenAsStudent_thenStudent() {
        //given
        final StudentEntity studentEntity = givenStudentEntity();
        final Student student = givenStudent();

        //when
        final Student actual = this.studentEntityMapper.asStudent(studentEntity);

        //then
        assertThat(actual).isEqualTo(student);
    }


    private Student givenStudent() {
        return Student.builder()
                .id(1L)
                .age(3)
                .name("Edvard")
                .secondName("Kolinsky")
                .course(4)
                .build();
    }

    private StudentEntity givenStudentEntity() {
        return StudentEntity.builder()
                .id(1L)
                .age(3)
                .name("Edvard")
                .secondName("Kolinsky")
                .course(4)
                .build();
    }
}
