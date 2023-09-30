package tech.angelofdiasg.contas;

public class ContaCorrente {
	public int numero;
	public String nome;
	public double saldo;
	public double limite;
	public double transferencia;
	
	   public void depositar(double valor){
		      double aux = valor - (valor * 0.35)/100;
		      this.saldo += aux;
		   }

	public ContaCorrente(String nome, double saldo, double limite) {
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + "\n, nome=" + nome + ", saldo=" + saldo + ", limite=" + limite
				+ ", transferencia=" + transferencia + "]";
	}

	   
	

}
