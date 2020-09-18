package entidade;
public class ContaPoupanca extends ContaBancaria {

	private double juros;
	private double CorrMonetaria, valorMensal;
	private int mesAniversario;

	// CONSTRUTORRES
	public ContaPoupanca(int numero, double saldo, int[] transacoes, double juros, double corrMonetaria,
			int mesAniversario) {
		super(numero, saldo, transacoes);
		this.juros = juros;
		CorrMonetaria = corrMonetaria;
		this.mesAniversario = mesAniversario;
	}

	public ContaPoupanca() {

	}

	// GETTERS E SETTERS
	public double getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(double valorMensal) {
		this.valorMensal = valorMensal;
	}

	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public double getCorrMonetaria() {
		return CorrMonetaria;
	}

	public void setCorrMonetaria(double corrMonetaria) {
		CorrMonetaria = corrMonetaria;
	}

	public int getMesAniversario() {
		return mesAniversario;
	}

	public void setMesAniversario(int mesAniversario) {
		this.mesAniversario = mesAniversario;
	}

	// MÉTODOS
	public double CalculaJuros() {

		int juros = (saldo * 00.1);
		return saldo;
	}

	public int aniversarioMes()
	{
      int mes= mesAniversario-2020;
      return mes;
}
}