package ru.example.tasktracker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import ru.example.tasktracker.model.TaskStatus;

import java.time.LocalDate;

public record TaskRequest(
        @NotBlank
        @Size(max = 120)
        String title,

        @Size(max = 1000)
        String description,

        @NotNull
        TaskStatus status,

        LocalDate dueDate
) {
}
