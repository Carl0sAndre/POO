/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author alunolab09
 */
public class Cliente {
    String nome;
    String sobrenome;
    String cpf;
    Cliente conjuge;
    
    public void Casar(Cliente conjuge)
    {
        if(this.conjuge != null)
        {
            this.conjuge = conjuge;
            this.conjuge.conjuge = this;
        }
        else
        {
            System.out.println("Já ta casado.");
        }
    }
}
