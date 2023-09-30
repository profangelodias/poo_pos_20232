package tech.angelofdiasg.contas;

import java.util.Scanner;

public class Conta {
	public int numero;
	public String nome;
	public double saldo;
	public double limite;
	public double movimentacaoAtual;

	public void sacar(double quantidade) {
		this.movimentacaoAtual = quantidade;
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;
	}
	
	public Conta() {
		System.out.println("Objeto conta criado!");
	}
	
	public Conta(int numero, String nome, double saldo, double limite) {
		this.numero = numero;
		this.nome = nome;
		this.limite = limite;
		this.saldo = saldo;
	}

	public Conta(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", nome=" + nome + ", saldo=" + saldo + ", limite=" + limite
				+ ", movimentacaoAtual=" + movimentacaoAtual + "]";
	}
	
		

}
