package tech.angelofdiasg.aPP;

import java.util.Scanner;

import tech.angelofdiasg.contas.*;

public class Main {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.limite = 100000;
		conta1.nome = "Carol";
		conta1.saldo = 7000;
		conta1.numero = 1;
		
		Conta conta2 = new Conta();
		conta2.limite = 200000;
		conta2.nome = "Junior";
		conta2.saldo = 9100;
		conta2.numero = 2;
		
		Conta conta3 = new Conta(3, "Dias", 1000, 3000);
		
		ContaCorrente cc1 = new ContaCorrente("Angelo", 1000, 5000);
		cc1.numero = conta3.numero + 1;
		
		System.out.println("Nome conta \n"+conta1.numero+": " + conta1.nome);
		System.out.println("Número conta 1: " + conta1.numero);
		System.out.println("Limite conta 1: " + conta1.limite);
		System.out.println("Saldo conta 1: " + conta1.saldo);
		System.out.println("----------------------");
		System.out.println("Nome conta 2: " + conta2.nome);
		System.out.println("Número conta 2: " + conta2.numero);
		System.out.println("Limite conta 2: " + conta2.limite);
		System.out.println("Saldo conta 2: " + conta2.saldo);
		
		conta1.sacar(5000);
		conta2.sacar(1000);
		System.out.println("Saldo conta 1 alterado: " + conta1.saldo);
		System.out.println("Saldo conta 2 Alterado: " + conta2.saldo);
		System.out.println("Valor movimentado da conta 2: " + conta2.movimentacaoAtual);
		
		System.out.println("----------------------");
		System.out.println("Nome conta 3: " + conta3.nome);
		System.out.println("Número conta 3: " + conta3.numero);
		System.out.println("Limite conta 3: " + conta3.limite);
		System.out.println("Saldo conta 3: " + conta3.saldo);
		
		System.out.println("----------------------");
		System.out.println("Nome conta Corrente: " + cc1.nome);
		System.out.println("Número conta corrente: " + cc1.numero);
		System.out.println("Limite conta corrente: " + cc1.limite);
		System.out.println("Saldo conta corrente: " + cc1.saldo);
		
		conta3.sacar(1000);
		cc1.depositar(1000);
		
		System.out.println(conta3);
		System.out.println(cc1);


	
	}

}
