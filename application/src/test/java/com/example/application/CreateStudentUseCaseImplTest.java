package com.example.application;

import com.example.domain.Student;
import com.example.repository.StudentRepository;
import com.example.usecase.student.CreateStudentUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
class CreateStudentUseCaseImplTest {

    @TestConfiguration
    static class TestContextConfiguration {
        @Bean
        public CreateStudentUseCase studentCreateUseCase(final StudentRepository studentRepository) {
            return new CreateStudentUseCaseImpl(studentRepository);
        }
    }

    @Autowired
    private CreateStudentUseCase createStudentUseCase;

    @MockBean
    private StudentRepository studentRepository;


    @Test
    void givenStudent_whenCreate_thenReturnCreatedStudent() {
        //given
        final Student student = mock(Student.class);

        when(studentRepository.create(student)).thenReturn(student);

        //when
        final Student actual = createStudentUseCase.execute(student);

        //then
        assertThat(actual).isEqualTo(student);
    }
}
