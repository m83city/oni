package com.example.repository;

import com.example.domain.Student;
import com.example.entity.StudentEntity;
import com.example.jpa.StudentJPARepository;
import com.example.mapper.StudentMapperRepo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mapstruct.factory.Mappers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class StudentRepositoryImplTest {
//    @Nested
//    @TestConfiguration
//    class TestContextConfiguration {
//        @Bean
//        public StudentRepository studentRepository(
//                final StudentJPARepository studentJPARepository,
//                final StudentMapperRepo studentMapperRepo) {
//            return new StudentRepositoryImpl(studentJPARepository, studentMapperRepo);
//        }
//    }

    //private final StudentMapperRepo studentMapperRepo = Mappers.getMapper(StudentMapperRepo.class);
//    @Mock
//    private StudentMapperRepo studentMapperRepo;

    //    @Autowired
//    private StudentRepository studentRepository;
//    @MockBean
//    private StudentJPARepository studentJPARepository;
//
//    @MockBean
//    private StudentMapperRepo studentMapperRepo;
//    // private final StudentMapperRepo studentMapperRepo = Mappers.getMapper(StudentMapperRepo.class);
//    @Mock
//    private StudentRepository studentRepository;
//    @Mock
//    private StudentJPARepository studentJPARepository;
//    @Mock
//    private StudentMapperRepo studentMapperRepo;

 //   @InjectMocks
 //   private Student studentRepoImpl = new StudentRepositoryImpl(studentJPARepository, studentMapperRepo).create(this.givenStudent());

    @Test
    void givenStudent_whenCreate_thenReturnCreatedStudent() {
        //       final Student student = this.givenStudent();
        //       final StudentEntity studentEntity = this.givenStudentEntity();

//        Mockito.when(studentMapperRepo.asStudent(studentEntity)).thenReturn(student);
//        Mockito.when(studentMapperRepo.asStudentEntity(student)).thenReturn(studentEntity);

//        when(this.studentMapperRepo.asStudent(studentEntity)).thenReturn(student);
//        when(this.studentMapperRepo.asStudentEntity(student)).thenReturn(studentEntity);
//        when(this.studentJPARepository.save(studentEntity)).thenReturn(studentEntity);
//
//            final Student actual = this.studentRepository.create(student);
//
//            verify(this.studentMapperRepo).asStudent(studentEntity);
//            verify(this.studentJPARepository).save(studentEntity);
//            verify(this.studentMapperRepo).asStudentEntity(student);
        //       verify(this.studentMapperRepo).asStudent(studentEntity);
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
