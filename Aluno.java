/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Random;
/**
 *
 * @author alunolab11
 */
public class Aluno {
    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private int periodo;
    private double nota_1b;
    private double nota_2b;
    private double nota_final;
    private static int qtdalunos = 0;
   
    public Aluno(String nome, String curso, String turma, int periodo, double nota_1b, double nota_2b) {
        this.matricula = gerarMatricula(matricula);
        this.nome = nome.toUpperCase();
        this.curso = curso;
        this.turma = turma;
        this.periodo = periodo;
        this.nota_1b = nota_1b;
        this.nota_2b = nota_2b;
        this.nota_final = calcularFinal();
        qtdalunos++;
    }
    
    
    public static String gerarMatricula(String matricula){
        int ano = 2025;
        Random random = new Random();
        int x = random.nextInt(10000);
        return String.format("%d%04d", ano, x);
    }
    
    public double calcularFinal(){
        return (this.nota_1b + this.nota_2b) / 2.0;
    }
    
    public void imprimir(){
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Curso: " + this.curso);
        System.out.println("Turma: " + this.turma);
        System.out.println("Período: " + this.periodo);
        System.out.println();
        System.out.println();
        System.out.println();
        
        
    }
    
}
