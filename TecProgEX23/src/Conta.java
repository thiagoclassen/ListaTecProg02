
public abstract class Conta {

	private double saldo = 0;
	private int numero;

	public void deposito(double valor) {
		this.saldo+=valor;
	}

	public void saldo() {
		System.out.println("O saldo é: "+this.saldo);
	}

	public void retirada(double valor) {
		saldo-=valor;
	}

	abstract void jurosDiarios(int dias);

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
