package com.example.mapper;

import com.example.domain.Student;
import com.example.entity.StudentEntity;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.assertj.core.api.Assertions.assertThat;

public class StudentMapperRepoTest {

    private StudentMapperRepo studentMapperRepo = Mappers.getMapper(StudentMapperRepo.class);

    @Test
    void givenStudent_whenAsStudentEntity_thenStudentEntity (){

        final StudentEntity studentEntity = givenStudentEntity();

        final Student student = givenStudent();

        final StudentEntity actual = this.studentMapperRepo.asStudentEntity(student);

        assertThat(actual).isEqualTo(studentEntity);
    }

    @Test
    void givenStudentEntity_whenAsStudent_thenStudent (){

        final StudentEntity studentEntity = givenStudentEntity();

        final Student student = givenStudent();

        final Student actual = this.studentMapperRepo.asStudent(studentEntity);

        assertThat(actual).isEqualTo(student);
    }


    private Student givenStudent () {
        return Student.builder()
                .id(1L)
                .age(3)
                .name("Edvard")
                .secondName("Kolinsky")
                .course(4)
                .build();
    }

    private StudentEntity givenStudentEntity () {
        return StudentEntity.builder()
                .id(1L)
                .age(3)
                .name("Edvard")
                .secondName("Kolinsky")
                .course(4)
                .build();
    }
}
