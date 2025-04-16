/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author alunolab08
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("AGENDA");
        
        AgendaTelefonica ag = new AgendaTelefonica();
        
        ag.inserir("Joao", "27999007788");
        ag.inserir("Maria", "27991885533");
        ag.inserir("Carlos", "27999443881");
        
        ag.imprimir();
        
        ag.removerNumero("Jair");
        System.out.println("Número do contato buscado: " + ag.buscarNome("Maria"));
        System.out.println("Tamanho da agenda: " + ag.tamanhoAgenda());
    }
}
