package com.api.cadunion.services;

import org.springframework.stereotype.Service;
import com.api.cadunion.repositories.UsersRepository;

@Service
public class UsersServices {

    final UsersRepository usersRepository;

    public UsersServices(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    
    
}
