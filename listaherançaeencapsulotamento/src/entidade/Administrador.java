package entidade;

public class Administrador extends Pessoa {
	
	private double valorEstadia;
	private double valorViagem;

	
	public double ajudaDeCusto() {
	double	ajudaDeCusto = valorEstadia+valorViagem;
	return ajudaDeCusto;
	}
	public Administrador(double valorEstadia, double valorViagem) {
	
		this.valorEstadia = valorEstadia;
		this.valorViagem = valorViagem;
	}
	public double getValorEstadia() {
		return valorEstadia;
	}
	public void setValorEstadia(double valorEstadia) {
		this.valorEstadia = valorEstadia;
	}
	public double getValorViagem() {
		return valorViagem;
	}
	public void setValorViagem(double valorViagem) {
		this.valorViagem = valorViagem;
	}
	
	

}
