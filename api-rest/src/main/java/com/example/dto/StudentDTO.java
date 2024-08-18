package com.example.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StudentDTO {
    private String name;
    private String second_name;
    private Integer age;
    private Integer cource;
    private Long id;
}
