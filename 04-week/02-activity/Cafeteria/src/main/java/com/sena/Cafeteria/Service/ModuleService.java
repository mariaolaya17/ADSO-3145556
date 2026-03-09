package com.sena.Cafeteria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Cafeteria.Entity.Module;
import com.sena.Cafeteria.Repository.IModuleRepository;

@Service
public class ModuleService {

    @Autowired
    private IModuleRepository repository;

    public List<Module> findAll(){
        return repository.findAll();
    }

    public Module save(Module module){
        return repository.save(module);
    }
}
