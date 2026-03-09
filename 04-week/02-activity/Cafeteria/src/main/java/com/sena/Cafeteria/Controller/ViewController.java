package com.sena.Cafeteria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.Cafeteria.Entity.View;
import com.sena.Cafeteria.Service.ViewService;

@RestController
@RequestMapping("/api/view")
public class ViewController {

    @Autowired
    private ViewService service;

    @GetMapping
    public List<View> getAll(){
        return service.findAll();
    }

    @PostMapping
    public View save(@RequestBody View view){
        return service.save(view);
    }
}