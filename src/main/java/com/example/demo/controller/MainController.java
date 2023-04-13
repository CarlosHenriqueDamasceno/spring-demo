package com.example.demo.controller;

import com.example.demo.dto.PersonInputDto;
import com.example.demo.dto.PersonOutputDto;
import com.example.demo.dto.PersonUpdateDto;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class MainController {

    private final PersonService service;

    public MainController(PersonService service) {
        this.service = service;
    }

    @GetMapping
    public List<Person> getAll() {
        return service.getAll();
    }

    @PostMapping
    public PersonOutputDto create(@RequestBody PersonInputDto data) {
        return service.create(data);
    }

    @PutMapping("{id}")
    public Person update(@PathVariable Long id, @RequestBody PersonUpdateDto data) {
        return service.update(id, data);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
