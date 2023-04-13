package com.example.demo.service;

import com.example.demo.dto.PersonInputDto;
import com.example.demo.dto.PersonOutputDto;
import com.example.demo.dto.PersonUpdateDto;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final PersonRepository repository;

    public PersonServiceImpl(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> getAll() {
        return repository.findAll();
    }

    @Override
    public PersonOutputDto create(PersonInputDto data) {
        Person entity = new Person();
        BeanUtils.copyProperties(data, entity);
        repository.save(entity);
        return new PersonOutputDto(entity);
    }

    @Override
    public Person update(Long id, PersonUpdateDto data) {
        Person person = repository.findById(id).orElseThrow(() -> new RuntimeException("Não achei esse id"));
        BeanUtils.copyProperties(data, person);
        repository.save(person);
        return person;
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
