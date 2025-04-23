package com.mycompany.mavenproject1;

public class Participantes {
    private String nome;
    private String email;
    
    public Participantes(String nome, String email){
        this.nome = nome;
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "Nome: " + nome + ", email: "+ email + '.';
    }
}
