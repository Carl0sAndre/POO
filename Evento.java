package com.mycompany.mavenproject1;
import java.util.Set;
import java.util.HashSet;

public class Evento {
    private String nome;
    Set<Participantes> participantes;
    
    public Evento(String nome){
        this.nome = nome;
        this.participantes = new HashSet<>();
    }
    
    public void addParticipante(Participantes p){
        boolean retorno = participantes.add(p);
        if (retorno == true){
            System.out.println("Participante adicionado.");
        }
        else{
            System.out.println("Participante já cadastrado.");
        }
    }
    
    public void removerParticipante(Participantes p){
        boolean retorno = participantes.remove(p);
        if (retorno == true){
            System.out.println("Participante removido.");
        }
        else{
            System.out.println("Participante não encontrado");
        }
    }
    
    public void imprimir(){
        if(participantes.isEmpty()){
            System.out.println("Sem participantes cadastrados");
        }
        else{
            System.out.println("Evento: " + this.nome);
            for(Participantes temp : participantes ){
                System.out.println(temp);
            }
        }
    }
}
