package com.example.repository;

import com.example.domain.Student;
import com.example.entity.StudentEntity;
import com.example.jpa.StudentJPARepository;
import com.example.mapper.StudentEntityMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class StudentRepositoryImplTest {

    @TestConfiguration
    static class TestContextConfiguration {
        @Bean
        public StudentRepository studentRepository(final StudentJPARepository studentJPARepository,
                                                   final StudentEntityMapper studentMapperRepo) {
            return new StudentRepositoryImpl(studentJPARepository, studentMapperRepo);
        }
    }

    @Autowired
    private StudentRepository studentRepository;

    @MockBean
    StudentJPARepository studentJPARepository;

    @MockBean
    StudentEntityMapper studentEntityMapper;


    @Test
    void givenStudent_whenCreate_thenReturnCreatedStudent() {
        //given
        final Student student = this.givenStudent();
        final StudentEntity studentEntity = this.givenStudentEntity();

        when(this.studentEntityMapper.asStudent(studentEntity)).thenReturn(student);
        when(this.studentEntityMapper.asStudentEntity(student)).thenReturn(studentEntity);
        when(this.studentJPARepository.save(studentEntity)).thenReturn(studentEntity);

        //when
        final Student actual = this.studentRepository.create(student);

        assertThat(actual).isEqualTo(student);

        //then

        verify(this.studentEntityMapper).asStudent(studentEntity);
        verify(this.studentJPARepository).save(studentEntity);
        verify(this.studentEntityMapper).asStudentEntity(student);

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
