package com.task.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.task.demo.dto.AiRequest;
import com.task.demo.service.GeminiService;

@RestController
@RequestMapping("/api/ai")
public class AiController {

    private final GeminiService geminiService;

    public AiController(GeminiService geminiService) {
        this.geminiService = geminiService;
    }

    @PostMapping("/generate")
    public ResponseEntity<String> generateTaskDescription(
            @RequestBody AiRequest request) {

        String response =
                geminiService.generateTaskDescription(
                        request.getTitle());

        return ResponseEntity.ok(response);
    }
}
