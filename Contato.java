/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab08
 */
public class Contato {
    private final String nome;
    private final String numero;
    
    public Contato(String nome, String numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }
    
    
    @Override
    public String toString(){
        return "Contato{" + "nome=" + nome + " numero=" + numero + '}';
    }
}
