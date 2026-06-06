package com.task.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.demo.entity.Task;
import com.task.demo.entity.User;

@Repository
public interface TaskRepository
        extends JpaRepository<Task, Long> {

    List<Task> findByUser(User user);

}