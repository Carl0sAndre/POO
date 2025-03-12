/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;
import java.util.Scanner;

/**
 *
 * @author alunolab08
 */
public class Main {

    public static void main(String[] args) {
        
        Conta conta = new Conta();
        conta.limite = 500.00;
        conta.numero = 10;
        
        Cliente cli = new Cliente();
        cli.nome = "João";
        cli.sobrenome = "Frango";
        cli.cpf = "111222333-44";
        
        conta.titular = cli;
        
        Cliente cli2 = new Cliente();
        cli2.cpf = "222111444-66";
        cli2.nome = "Maria";
        cli2.sobrenome = "Bonita";
        
        cli.Casar(cli2);
        Scanner scan = new Scanner(System.in);
        int opcao;
        
                
        do
        {
            System.out.println("-------------------------------------");
            System.out.println("Digite o número da escolha desejada: ");
            System.out.println("-------------------------------------");
	    System.out.println("[1] Sacar");
	    System.out.println("[2] Depositar");
	    System.out.println("[3] Consultar Saldo");
	    System.out.println("[4] Consultar Limite");
	    System.out.println("[0] Sair");
	    System.out.println("-------------------------------------");
            System.out.print("Escolha a sua opção: ");
            opcao = scan.nextInt();
        
            switch(opcao)
            {
                case 0:
                    System.out.println("Saindo...");
                    break;
                case 1:
                    System.out.print("Digite o valor que deseja sacar: ");
                    double saque = scan.nextDouble();
                    conta.sacar(saque);
                    break;
                case 2:
                    System.out.print("Digite o valor que deseja depositar: ");
                    double deposi = scan.nextDouble();
                    conta.deposito(deposi);
                    break;
                case 3:
                    System.out.printf("O seu saldo é de: R$ %.2f\n", conta.getSaldo());
                    break;
                case 4:
                    System.out.printf("Seu limite atual é de: R$ %.2f\n", conta.getLimite());
                    break;
                default:
                    System.err.println("Opção inválida.");
                
            }
        }while(opcao != 0);
    }
}
