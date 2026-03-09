package com.sena.Cafeteria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.Cafeteria.Entity.Person;
import com.sena.Cafeteria.Service.PersonService;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    public List<Person> getAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Person getById(@PathVariable Long id){
        return service.findById(id);
    }

    @GetMapping("/name/{name}")
    public List<Person> getByName(@PathVariable String name){
        return service.findByName(name);
    }

    @PostMapping
    public Person save(@RequestBody Person person){
        return service.save(person);
    }
}
