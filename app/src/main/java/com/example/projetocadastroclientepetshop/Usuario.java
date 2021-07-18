package com.example.projetocadastroclientepetshop;

import java.io.Serializable;

public class Usuario implements Serializable {
//Serializable assim eu consigo colocar ele nos putExtra

   private String nome,endereco,telefone;

    public Usuario(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
