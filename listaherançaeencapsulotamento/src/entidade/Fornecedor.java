package entidade;

public class Fornecedor extends Pessoa {

	private double valorCredito; // correspondente ao crédito máximo atribuído ao fornecedor
	private double valorDivida; // montante da dívida para com o fornecedor
	private double obterSaldo;

	public Fornecedor() {

	}

	public Fornecedor(String nome, double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public Fornecedor(String nome, double valorCredito, double valorDivida) {
		this.setNome(nome);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Fornecedor(String nome, double valorCredito, double valorDivida, double obterSaldo) {
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}

	public Fornecedor(String nome, String endereço, long telefone, double valorCredito, double valorDivida,
			double obterSaldo) {
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
		this.obterSaldo = obterSaldo;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public double getObterSaldo() {
		obterSaldo = valorCredito - valorDivida;
		return obterSaldo;
	}

	public void setObterSaldo(double obterSaldo) {
		this.obterSaldo = obterSaldo;
	}
}
