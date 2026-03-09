package com.sena.Cafeteria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Cafeteria.Entity.View;
import com.sena.Cafeteria.Repository.IViewRepository;

@Service
public class ViewService {

    @Autowired
    private IViewRepository repository;

    public List<View> findAll(){
        return repository.findAll();
    }

    public View save(View view){
        return repository.save(view);
    }
}