package com.example.webapp.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {
    private Integer id;
    private String todo;
    private String detail;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
