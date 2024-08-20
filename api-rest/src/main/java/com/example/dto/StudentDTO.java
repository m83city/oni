package com.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDTO {

    private Long id;

    private String name;

    private String secondName;

    private Integer age;

    private Integer course;
}
