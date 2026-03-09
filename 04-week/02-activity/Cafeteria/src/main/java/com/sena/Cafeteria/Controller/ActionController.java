package com.sena.Cafeteria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.Cafeteria.Entity.Action;
import com.sena.Cafeteria.Service.ActionService;

@RestController
@RequestMapping("/api/action")
public class ActionController {

    @Autowired
    private ActionService service;

    @GetMapping
    public List<Action> getAll(){
        return service.findAll();
    }

    @PostMapping
    public Action save(@RequestBody Action action){
        return service.save(action);
    }
}
