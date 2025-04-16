/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author alunolab08
 */
public class AgendaTelefonica {
    private List<Contato> colecao = new ArrayList<>();
    
    public void inserir(String nome, String numero){
        Contato cont = new Contato(nome, numero);
        colecao.add(cont);
    }
    
    public Contato buscarNome(String nome){
        for(Contato aux : this.colecao){
            if(aux.getNome().equalsIgnoreCase(nome)){
                return aux;
            }
        }
        return null;
    }
    
    public int tamanhoAgenda(){
        return this.colecao.size();
    }
    
    public void removerNumero(String nome){
        Contato deletar = null;
        for(Contato aux : this.colecao){
            if(aux.getNome().equalsIgnoreCase(nome)){
                deletar = aux;
            }
        }
        
        if(deletar != null){
            this.colecao.remove(deletar);
            System.out.println("Deletado.");
        }
        else{
            System.out.println("Não encontrado.");
        }
    }
    
    public void imprimir(){
        if(this.colecao.isEmpty()){
            System.out.println("Agenda vazia.");
        }
        else{
            for(Contato aux : this.colecao){
                System.out.println(aux);
            }
        }
    }
}
