package entidade;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	private int qtdArtigosProduzidos;
	
	
	

	
	public Operario(double valorProducao, double comissao, int qtdArtigosProduzidos) {
		
		this.valorProducao = valorProducao;
		this.comissao = comissao;
		this.qtdArtigosProduzidos = qtdArtigosProduzidos;
	}


	public double calculoComissao() {
		double calculoComissao = qtdArtigosProduzidos*comissao;
		return calculoComissao;
		
	}
	

	public double calculaProducaoOperario() {
		double calculaProducaoOperario = valorProducao * qtdArtigosProduzidos;
		return calculaProducaoOperario;
	}
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public int getQtdArtigosProduzidos() {
		return qtdArtigosProduzidos;
	}
	public void setQtdArtigosProduzidos(int qtdArtigosProduzidos) {
		this.qtdArtigosProduzidos = qtdArtigosProduzidos;
	}
	
	
	

}
