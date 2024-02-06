package application;

import java.util.Scanner;
import entites.Conta;

public class Cadastro {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
				
		System.out.println("Escreva Seu nome:");
		String nome = sc.next();
		
		System.out.println("Entre com o numero de sua conta");
		int num = sc.nextInt();
		
		System.out.println("Nome: " + nome + "Numero da Conta: " + num + "Valor: ");
		
		System.out.println("Deseja Fazer um deposito inicial?");
		char resp = sc.next().charAt(0);
		
		if(resp == 's') {
			System.out.println("Qual o valor do deposito");
			double depI = sc.nextDouble();
			conta = new Conta(num, nome , depI);
		}
		else {
			conta = new Conta(num, nome);
		}
		
		System.out.println();
		System.out.println("Informaçoes da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Valor deposito inicial: ");
		double depI = sc.nextDouble();
		conta.deposito(depI);
		System.out.println("Valor na conta alterado: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Valor saque: ");
		double saqI = sc.nextDouble();
		conta.saque(saqI);
		System.out.println("Valor na conta alterado: ");
		System.out.println(conta);
	}

}
