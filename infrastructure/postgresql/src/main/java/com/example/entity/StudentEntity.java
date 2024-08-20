package com.example.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentEntity {
    private Long id;
    private String name;
    private String secondName;
    private Integer age;
    private Integer course;
}
