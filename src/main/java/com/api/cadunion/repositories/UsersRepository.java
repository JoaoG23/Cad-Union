package com.api.cadunion.repositories;

import com.api.cadunion.models.UserModel;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// Inplementa todos os metodos da jpa + Consumizados
@Repository
public interface UsersRepository extends JpaRepository<UserModel, UUID>{
    boolean existsByUsuario(String usuario);
}
