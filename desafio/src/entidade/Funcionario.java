package entidade;

public class Funcionario {
	
	private String nome;
	private int horasTrabalhadas;
	private double valorPorHora;
	
	
	public double calculaPagamento() {
		double calculaPagamento = horasTrabalhadas * valorPorHora;
		return calculaPagamento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}




	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}




	public double getValorPorHora() {
		return valorPorHora;
	}




	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}




	public Funcionario(String nome, int horasTrabalhadas, double valorPorHora) {
		this.nome = nome;
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorPorHora = valorPorHora;
	}
	

}
