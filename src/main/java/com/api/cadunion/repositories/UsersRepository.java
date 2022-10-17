package com.api.cadunion.repositories;

import com.api.cadunion.models.UserModel;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UserModel, UUID>{
    
}
