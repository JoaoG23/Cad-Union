package com.api.cadunion.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UsersDto {
    
  
    @NotBlank
    @Size(max = 75)
    private String nome;

    @NotBlank
    @Size(max = 75)
    private String sobrenome;
    
    @NotBlank
    private String usuario;
    
    @NotBlank
    private String senha;


    // Gettes e Settes

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
