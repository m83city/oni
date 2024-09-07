package com.example.controller;

import com.example.domain.Student;
import com.example.dto.StudentDTO;
import com.example.mapper.StudentDtoMapper;
import com.example.usecase.student.CreateStudentUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class StudentControllerTest {

//    @TestConfiguration
//    static class TestContextConfiguration {
//
//        @Bean
//        public StudentController studentController(final StudentDtoMapper studentDtoMapper,
//                                                   final CreateStudentUseCase studentCreateUseCase) {
//            return new StudentController(studentCreateUseCase, studentDtoMapper);
//        }
//    }
//
//    @Autowired
//    private StudentController studentController;
//
//    @MockBean
//    private StudentDtoMapper studentDtoMapper;
//
//    @MockBean
//    private CreateStudentUseCase studentCreateUseCase;
//
//    @Test
//    void givenStaffDTO_whenCreate_thenReturnSuccess() {
//        //given
//        final Student student = mock(Student.class);
//        final StudentDTO studentDTO = mock(StudentDTO.class);
//
//        when(this.studentDtoMapper.asStudent(studentDTO)).thenReturn(student);
//        when(this.studentDtoMapper.astudentDTO(student)).thenReturn(studentDTO);
//        when(this.studentController.create(studentDTO)).thenReturn(student);
//
//        //when
//        final Student actual = this.studentController.create(studentDTO);
//
//        //then
//        assertThat(actual).isEqualTo(student);
//    }
}
