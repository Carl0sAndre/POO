package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("EVENTO!");
        Evento ev1 = new Evento("Expoagro");
        
        Participantes p1 = new Participantes("Carlos", "carlos@gmail.com");
        Participantes p2 = new Participantes("Cazé", "caze@gmail.com");
        Participantes p3 = new Participantes("Andre", "andre@gmail.com");
        Participantes p4 = new Participantes("Matheus", "matheus@gmail.com");
        Participantes p5 = new Participantes("Pastor", "pastor@gmail.com");
        
        ev1.addParticipante(p1);
        ev1.addParticipante(p2);
        ev1.addParticipante(p3);
        ev1.addParticipante(p4);
        ev1.addParticipante(p5);
        
        
        ev1.removerParticipante(p5);
        ev1.removerParticipante(p3);
        
        ev1.imprimir();
    }
}
