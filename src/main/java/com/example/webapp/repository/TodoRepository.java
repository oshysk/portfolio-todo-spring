package com.example.webapp.repository;

// import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.webapp.entity.Todo;

public interface TodoRepository extends PagingAndSortingRepository<Todo, Integer> {

}
