package com.sena.Cafeteria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Cafeteria.Entity.Person;
import com.sena.Cafeteria.Repository.IPersonRepository;

@Service
public class PersonService {

    @Autowired
    private IPersonRepository repository;

    public List<Person> findAll(){
        return repository.findAll();
    }
    public Person findById(Long id){
        return repository.findById(id).orElse(null);
    }

    public Person save(Person person){
        return repository.save(person);
    }

    public List<Person> findByName(String name) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}