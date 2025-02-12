package com.example.EsteticaMersy.controller;

import com.example.EsteticaMersy.entity.users;
import com.example.EsteticaMersy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "api/v1/users")
public class EmpleadoContoller {

    @Autowired
    private UserService userservice;

    @GetMapping("/{userId}")
    public List<users> getBId(@PathVariable("userId") Long userId){
        return userservice.getUsers(userId);
    }

    @PostMapping
    public void saveUpdate(@RequestBody users user){
        userservice.saveOrUpdate(user);
    }

    @DeleteMapping("/{userId}")
    public void delete(@PathVariable("userId") Long userId){
        userservice.delete(userId);
    }

}
