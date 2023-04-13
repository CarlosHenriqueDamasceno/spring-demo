package com.example.demo.dto;

import java.time.LocalDate;

public record PersonUpdateDto(String name, LocalDate birthDate) {
}
