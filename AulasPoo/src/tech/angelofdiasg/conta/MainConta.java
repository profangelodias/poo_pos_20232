package tech.angelofdiasg.conta;

import java.util.Scanner;

public class MainConta {

	public static void main(String[] args) {
		Conta ContaDoRodrigo = 	new Conta();
		//Conta contaDoUsuario2 = 	new Conta();
		//Conta contaDoUsuario3 = 	new Conta();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o nome: ");
		ContaDoRodrigo.nome = leitor.nextLine();
		System.out.println("Informe o limite:");
		ContaDoRodrigo.limite = leitor.nextDouble();
		System.out.println("Informe o saldo:");
		ContaDoRodrigo.saldo = leitor.nextDouble();
		ContaDoRodrigo.numero = 1;
		
		
		//contaDoUsuario2.nome = "João";
		//contaDoUsuario3.nome = "Maria";
		
		System.out.println("Nome da conta: " + ContaDoRodrigo.nome);
		System.out.println("Número da conta: " + ContaDoRodrigo.numero);
		System.out.println("Limite da conta: " + ContaDoRodrigo.limite);
		System.out.println("Saldo da conta: " + ContaDoRodrigo.saldo);
		
		leitor.close();
	}

}
