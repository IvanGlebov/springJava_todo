package com.example.todo;

import com.example.todo.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

interface TodoRepository extends JpaRepository<TodoItem, Long> {
}
