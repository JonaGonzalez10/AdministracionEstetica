package com.example.EsteticaMersy.service;

import com.example.EsteticaMersy.entity.users;
import com.example.EsteticaMersy.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<users> getUsers(Long userId){
        return empleadoRepository.findAll();
    }
    public Optional<users> getUser(Long id){
        return empleadoRepository.findById(id);
    }

    public void saveOrUpdate(users user){
        empleadoRepository.save(user);
    }

    public void delete(Long id){
        empleadoRepository.deleteById(id);
    }



}
