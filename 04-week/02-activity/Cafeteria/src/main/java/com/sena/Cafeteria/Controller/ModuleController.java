package com.sena.Cafeteria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.Cafeteria.Entity.Module;
import com.sena.Cafeteria.Service.ModuleService;

@RestController
@RequestMapping("/api/module")
public class ModuleController {

    @Autowired
    private ModuleService service;

    @GetMapping
    public List<Module> getAll(){
        return service.findAll();
    }

    @PostMapping
    public Module save(@RequestBody Module module){
        return service.save(module);
    }
}