package com.example.todo;

import com.example.todo.model.UserInstance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserInstance, Long> {
}
