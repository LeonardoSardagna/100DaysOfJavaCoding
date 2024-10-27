package com.praticando.java.Day5.exercicio02;

//exercício 02
public class Usuario {
    private String nome;
    private int idade;
    private String email;
    private String senha;

    public Usuario(String nome, int idade, String email, String senha) {
        this.nome = nome;
        if (idade >= 18) {
            this.idade = idade;
        }else {
            throw new IllegalArgumentException("O usuário deve ter 18 anos de idade");
        }
        this.email = email;
        if (senha.length() >= 8) {
            this.senha = senha;
        }else {
            throw new IllegalArgumentException("A senha deve possui 8 ou mais caracteres");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
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

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Idade: " + idade +
                ", E-mail: " + email +
                ", Senha: " + senha;
    }
}

