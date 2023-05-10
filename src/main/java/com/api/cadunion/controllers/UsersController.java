package com.api.cadunion.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Optional;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;

import org.springframework.data.web.PageableDefault;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import com.api.cadunion.dtos.UsersDto;
import com.api.cadunion.models.UserModel;
import com.api.cadunion.services.UsersServices;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController

@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users") // URI - Pré definida a nivel de classe
public class UsersController {
    final UsersServices usersServices;

    public UsersController(UsersServices usersServices) {
        this.usersServices = usersServices; // Construtor
    }

    @PostMapping
    public ResponseEntity<Object> saveUsers(@RequestBody @Valid UsersDto usersDto) { // Envia a validacão de dados como
                                                                                     // callback para validar daddos

        if (usersServices.existsByUsuario(usersDto.getUsuario())) {

            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflint: Esse nome de usuário já existe");
        }
        var userModel = new UserModel(); // Instancia objeto

        BeanUtils.copyProperties(usersDto, userModel); // converte DTO para entidade

        userModel.setCreateAt(LocalDateTime.now(ZoneId.of("UTC"))); // Inserer data de criação

        return ResponseEntity.status(HttpStatus.CREATED).body(usersServices.save(userModel));
    }

    @GetMapping
    public ResponseEntity<Page<UserModel>> getAllUsers(
            @PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(usersServices.findAll(pageable));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneUser(@PathVariable(value = "id") UUID id) {

        Optional<UserModel> userModelOptional = usersServices.findById(id);

        if (!userModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(" Usuário não foi encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(userModelOptional.get()); // Retorna o elemento achado
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteUser(@PathVariable(value = "id") UUID id) {

        Optional<UserModel> userModelOptional = usersServices.findById(id);

        if (!userModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não existe para ser excluido");
        }

        usersServices.delete(userModelOptional.get()); // insere o model dentro do elemento
        return ResponseEntity.status(HttpStatus.OK).body("Usuário excluido com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateUser(@PathVariable(value = "id") UUID id,
            @RequestBody @Valid UsersDto usersDto) {

        Optional<UserModel> userModelOptional = usersServices.findById(id);

        if (!userModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuário não existe para atualizado");
        }

        // O PRIMEIRO MODO de ser Fazer
        // var userModel = userModelOptional.get();

        // userModel.setNome(usersDto.getNome());
        // userModel.setSobrenome(usersDto.getSobrenome());
        // userModel.setUsuario(usersDto.getUsuario());
        // userModel.setSenha(usersDto.getSenha());

        var userModel = new UserModel();

        BeanUtils.copyProperties(usersDto, userModel);

        userModel.setId(userModelOptional.get().getId()); // Para permanecer o mesmo ID do banco de dados

        userModel.setCreateAt(userModelOptional.get().getCreateAt()); // Buscar a data de registro no banco de dados

        return ResponseEntity.status(HttpStatus.OK).body(usersServices.save(userModel));

    }
}
