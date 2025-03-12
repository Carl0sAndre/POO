/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author alunolab08
 */
public class Conta {
    private double saldo = 1000.00;
    double limite;
    int numero;
    Cliente titular;
    
    
    void sacar(double valor)
    {
        if(valor > 0 && valor <= saldo + limite)
        {
            saldo -= valor;
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        }
        else
        {
            System.out.println("Saldo insuficiente ou valor errado.\n");
        }
    }
    void deposito(double valor)
    {
        if(valor > 0)
        {
            saldo = saldo + valor;
            System.out.printf("Depósito de R$ %.2f realizado com sucesso.\n", valor);
        }
        else
        {
            System.out.println("Valor de depósito inválido.\n");
        }
    }
    
    public double getSaldo()
    {
        return saldo;
    }
    public double getLimite()
    {
        return limite;
    }
}