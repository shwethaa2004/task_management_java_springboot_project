package com.task.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AiRequest {

    @NotBlank(message = "Title is required")
    private String title;
}