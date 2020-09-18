package entidade;

public class ContaEspecial  {

	private double limite = 500;
	private double selic = 2.0;

	//metodo
	public double calculaJurosEsp() {
		return saldo * selic;
	}
	
	public double limite() {
		return limite;
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getSelic() {
		return selic;
	}

	public void setSelic(double selic) {
		this.selic = selic;
	}

}