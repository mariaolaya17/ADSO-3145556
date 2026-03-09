package com.sena.Cafeteria.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.Cafeteria.Entity.Role;
import com.sena.Cafeteria.Repository.IRoleRepository;

@Service
public class RoleService {

    @Autowired
    private IRoleRepository repository;

    public List<Role> findAll(){
        return repository.findAll();
    }

    public Role save(Role role){
        return repository.save(role);
    }
}