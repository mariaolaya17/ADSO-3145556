package com.sena.Cafeteria.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.Cafeteria.Entity.User;
import com.sena.Cafeteria.Service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public List<User> getAll(){
        return service.findAll();
    }

    @PostMapping
    public User save(@RequestBody User user){
        return service.save(user);
    }
}
