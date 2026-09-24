package ru.example.tasktracker.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.tasktracker.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
