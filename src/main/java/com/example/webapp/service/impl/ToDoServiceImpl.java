package com.example.webapp.service.impl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.webapp.entity.Todo;
import com.example.webapp.service.ToDoService;

import lombok.RequiredArgsConstructor;

import com.example.webapp.repository.TodoRepository;

@Service
@RequiredArgsConstructor
public class ToDoServiceImpl implements ToDoService {

    private final TodoRepository todoRepository;

    @Override
    public List<Todo> findAll() {
        return (List<Todo>) todoRepository.findAll(Sort.unsorted());
    }
}
