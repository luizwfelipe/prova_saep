/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.bean;

/**
 *
 * @author Senai
 */
public class ProfessorDTO {
    private int idProfessor;
    private String nome;
    private String email;
    private String senha;

    public ProfessorDTO() {
    }

    public ProfessorDTO(int idProfessor, String nome, String email, String senha) {
        this.idProfessor = idProfessor;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public int getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(int idProfessor) {
        this.idProfessor = idProfessor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

  
    
}
