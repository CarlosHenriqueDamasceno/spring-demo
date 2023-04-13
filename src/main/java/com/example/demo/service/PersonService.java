package com.example.demo.service;

import com.example.demo.dto.PersonUpdateDto;
import com.example.demo.entity.Person;

import java.util.List;

public interface PersonService {

    public List<Person> getAll();

    public void create(Person data);

    public Person update(Long id, PersonUpdateDto data);

    public void delete(Long id);
}
