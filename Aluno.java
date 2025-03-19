package com.mycompany.mavenproject1;
import java.util.Random;
import java.time.Year;

public class Aluno {
    private static int qtdalunos = 0;
    private String matricula;
    private String nome;
    private String curso;
    private String turma;
    private int periodo;
    private double nota_1b;
    private double nota_2b;
    private double nota_final;
    
    public Aluno(){
        this.matricula = gerarMatricula(matricula);
        this.nota_final = calcularFinal();
        qtdalunos++;
    }
    
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
        Random random = new Random();
        int ano = Year.now().getValue();
        int x = random.nextInt(10000);
        return String.format("%d%04d", ano, x);
    }
    
    public double calcularFinal() {
        return (this.nota_1b + this.nota_2b) / 2.0; 
    }
    
    public boolean passar(String novaTurma, int novoPeriodo){
        if (this.nota_final >= 7){
            this.turma = novaTurma;
            this.periodo = novoPeriodo;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void imprimir(){
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Nome: " + this.nome);
        System.out.println("Curso: " + this.curso);
        System.out.println("Turma: " + this.turma);
        System.out.println("Período: " + this.periodo);
        System.out.println("Nota primeiro bimestre: " + this.nota_1b);
        System.out.println("Nota segundo bimestre: " + this.nota_2b);
        System.out.println("Nota final: " + this.nota_final);
    }
    
    public void imprimirQtdDeAlunos(){
        System.out.println("Quantidade total de alunos: " + qtdalunos);
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public String getTurma() {
        return turma;
    }

    public int getPeriodo() {
        return periodo;
    }

    public double getNota_1b() {
        return nota_1b;
    }

    public double getNota_2b() {
        return nota_2b;
    }

    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setNota_1b(double nota_1b) {
        this.nota_1b = nota_1b;
    }

    public void setNota_2b(double nota_2b) {
        this.nota_2b = nota_2b;
    }
    
    
}
