package entidade;

public class Vendedor extends Pessoa {
	private double valorVendas;
	private int qtdArtigosVendidos;
	private double comissao;

	
	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public int getQtdArtigosVendidos() {
		return qtdArtigosVendidos;
	}

	public void setQtdArtigosVendidos(int qtdArtigosVendidos) {
		this.qtdArtigosVendidos = qtdArtigosVendidos;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public Vendedor(double valorVendas, int qtdArtigosVendidos) {
		this.valorVendas = valorVendas;
		this.qtdArtigosVendidos = qtdArtigosVendidos;
	}


	public double calculoVendendor(){
		double calculoVendedor = valorVendas*qtdArtigosVendidos;
		return calculoVendedor;
	}

}
