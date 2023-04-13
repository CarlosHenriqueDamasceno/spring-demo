package com.example.demo.dto;

import java.time.LocalDate;

public record PersonInputDto(String name, LocalDate birthDate) {
}
