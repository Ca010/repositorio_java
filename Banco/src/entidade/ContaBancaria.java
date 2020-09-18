package entidade;

public abstract class ContaBancaria {
	private int numero;
	private double saldo;
	private int[] transacoes;

	public ContaBancaria(int numero, double saldo, int[] transacoes) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.transacoes = transacoes;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public int[] getTransacoes() {
		return transacoes;
	}

	public void emiteExtrato() {
		System.out.println("O número da sua conta é: " + this.numero);
		System.out.println("O número de transações feitas foi de: " + this.transacoes);
		System.out.println("O saldo é de: " + this.saldo);

	}

	public double credite() {

	}

}