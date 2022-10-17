package com.api.cadunion.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.cadunion.services.UsersServices;

@RestController

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class UsersController {
    final UsersServices usersServices;

    
    public UsersController(UsersServices usersServices) {
        this.usersServices = usersServices;
    }

    
}
