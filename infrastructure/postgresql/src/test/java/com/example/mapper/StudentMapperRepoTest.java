package com.example.mapper;

import com.example.domain.Student;
import com.example.entity.StudentEntity;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class StudentMapperRepoTest {

    @Mock
    private StudentMapperRepo studentMapperRepo;

    @Test
    void givenStudent_whenAsStudentEntity_thenStudentEntity() {

        final StudentEntity studentEntity = givenStudentEntity();
        final Student student = givenStudent();

        when(this.studentMapperRepo.asStudentEntity(student)).thenReturn(studentEntity);

        final StudentEntity actual = this.studentMapperRepo.asStudentEntity(student);

        verify(this.studentMapperRepo).asStudentEntity(student);

        assertThat(actual).isEqualTo(studentEntity);
    }

    @Test
    void givenStudentEntity_whenAsStudent_thenStudent() {

        final StudentEntity studentEntity = givenStudentEntity();
        final Student student = givenStudent();

        when(this.studentMapperRepo.asStudent(studentEntity)).thenReturn(student);

        final Student actual = this.studentMapperRepo.asStudent(studentEntity);

        verify(this.studentMapperRepo).asStudent(studentEntity);

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
