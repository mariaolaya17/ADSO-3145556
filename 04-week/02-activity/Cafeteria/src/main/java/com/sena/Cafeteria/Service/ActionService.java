package com.sena.Cafeteria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Cafeteria.Entity.Action;
import com.sena.Cafeteria.Repository.IActionRepository;

@Service
public class ActionService {

    @Autowired
    private IActionRepository repository;

    public List<Action> findAll(){
        return repository.findAll();
    }

    public Action save(Action action){
        return repository.save(action);
    }
}
