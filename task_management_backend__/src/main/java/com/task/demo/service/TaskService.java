package com.task.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.task.demo.dto.TaskRequest;

import com.task.demo.entity.Task;
import com.task.demo.entity.TaskStatus;
import com.task.demo.entity.User;

import com.task.demo.repository.TaskRepository;
import com.task.demo.repository.UserRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    private final UserRepository userRepository;

    public TaskService(
            TaskRepository taskRepository,
            UserRepository userRepository) {

        this.taskRepository = taskRepository;
        this.userRepository = userRepository;
    }

    public Task createTask(
            TaskRequest request,
            String email) {

        User user =
                userRepository.findByEmail(email)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "User not found"));

        Task task = new Task();

        task.setTitle(request.getTitle());

        task.setDescription(
                request.getDescription());

        task.setPriority(
                request.getPriority());

        task.setDueDate(
                request.getDueDate());

        task.setStatus(
                TaskStatus.valueOf(
                        request.getStatus()));

        task.setCreatedAt(
                LocalDateTime.now());

        task.setUser(user);

        return taskRepository.save(task);
    }

    public List<Task> getAllTasks(
            String email) {

        User user =
                userRepository.findByEmail(email)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "User not found"));

        return taskRepository.findByUser(user);
    }

    public Task updateTask(
            Long id,
            TaskRequest request,
            String email) {

        Task task =
                taskRepository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Task not found"));

        task.setTitle(request.getTitle());

        task.setDescription(
                request.getDescription());

        task.setPriority(
                request.getPriority());

        task.setDueDate(
                request.getDueDate());

        task.setStatus(
                TaskStatus.valueOf(
                        request.getStatus()));

        return taskRepository.save(task);
    }

    public void deleteTask(
            Long id,
            String email) {

        Task task =
                taskRepository.findById(id)
                        .orElseThrow(() ->
                                new RuntimeException(
                                        "Task not found"));

        taskRepository.delete(task);
    }
}