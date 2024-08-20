package com.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    @Id
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "second_name")
    private String secondName;
    @Column(name = "age")
    private Integer age;
    @Column(name = "course")
    private Integer course;
}
