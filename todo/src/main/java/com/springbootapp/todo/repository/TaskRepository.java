package com.springbootapp.todo.repository;

import com.springbootapp.todo.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
