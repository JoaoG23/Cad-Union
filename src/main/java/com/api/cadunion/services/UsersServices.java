package com.api.cadunion.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;

import com.api.cadunion.models.UserModel;
import com.api.cadunion.repositories.UsersRepository;

@Service
public class UsersServices {

    final UsersRepository usersRepository; // atributo Final

    public UsersServices(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Transactional // para o banco de dados nao ter dados quebrados
    public UserModel save(UserModel userModel) {
        return usersRepository.save(userModel);
    }

    public boolean existsByUsuario(String usuario) {
        return usersRepository.existsByUsuario(usuario);
    }

    public Page<UserModel> findAll(Pageable pageable) {
        return usersRepository.findAll(pageable);
    }

    public Optional<UserModel> findById(UUID id) {
        return usersRepository.findById(id);
    }

    @Transactional
    public void delete(UserModel userModel) {
        usersRepository.delete(userModel);
    }
    
    
}
