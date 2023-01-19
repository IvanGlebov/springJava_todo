package com.example.todo;

import java.util.List;
import java.util.Optional;

import com.example.todo.model.TodoItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class TodoController {

    private final TodoRepository repository;

    @Autowired
    private UserRepository usersRepo;

    TodoController(TodoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/api/todos")
    List<TodoItem> all() {
        return repository.findAll();
    }

    @GetMapping("/api/todoById")
    Optional<TodoItem> getTodoItemById(@RequestParam("id") Long id) {
        return repository.findById(id);
    }
    @GetMapping("/api/addTodo")
    TodoItem addTodo(@RequestParam("userId") Long id, @RequestParam("name") String name, @RequestParam("description") String description) {
        TodoItem item = new TodoItem(name, description, usersRepo.getById(id));
        return repository.save(item);
    };
}
