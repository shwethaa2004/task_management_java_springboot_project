package com.task.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import com.task.demo.dto.TaskRequest;
import com.task.demo.entity.Task;
import com.task.demo.service.TaskService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(
            @Valid @RequestBody TaskRequest request,
            Authentication authentication) {

        String email =
                authentication.getName();

        return ResponseEntity.ok(
                taskService.createTask(
                        request,
                        email));
    }

    @GetMapping
    public ResponseEntity<List<Task>> getAllTasks(
            Authentication authentication) {

        String email =
                authentication.getName();

        return ResponseEntity.ok(
                taskService.getAllTasks(email));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Task> updateTask(
            @PathVariable Long id,
            @RequestBody TaskRequest request,
            Authentication authentication) {

        String email =
                authentication.getName();

        return ResponseEntity.ok(
                taskService.updateTask(
                        id,
                        request,
                        email));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTask(
            @PathVariable Long id,
            Authentication authentication) {

        String email =
                authentication.getName();

        taskService.deleteTask(
                id,
                email);

        return ResponseEntity.ok(
                "Task Deleted Successfully");
    }
}