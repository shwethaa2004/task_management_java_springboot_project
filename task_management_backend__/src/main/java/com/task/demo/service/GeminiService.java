package com.task.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GeminiService {

    public String generateTaskDescription(
            String title) {

        return """
                Description:
                Complete the task efficiently.

                Suggested Priority:
                HIGH

                Estimated Time:
                4 Hours
                """;
    }
}