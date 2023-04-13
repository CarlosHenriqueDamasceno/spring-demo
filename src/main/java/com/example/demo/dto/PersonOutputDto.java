package com.example.demo.dto;

import com.example.demo.entity.Person;

import java.time.LocalDate;

public record PersonOutputDto(Long id, String name, LocalDate birthDate) {
    public PersonOutputDto(Person entity) {
        this(entity.getId(), entity.getName(), entity.getBirthDate());
    }
}
