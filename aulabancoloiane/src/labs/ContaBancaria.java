package labs;

public class ContaBancaria {
	private String nomeCliente;
	private String numConta;
	private double saldo;
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getNumConta() {
		return numConta;
	}
	public void setNumConta(String numConta) {
		this.numConta = numConta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//to String para fazer a saida dos atributos da conta bancaria
	@Override
	public String toString() {
		String s = "ContaBancari [";
		s += "nomeCliente: " + nomeCliente;
		s += "NumConta: " + numConta;
		s += "saldo: " + saldo;
		s += "]";
		return s;
	}  
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public boolean sacar(double valor) {
		if((saldo-valor) >=0) {
			saldo -= valor;
			return true;
		}
		return false;
	}

}
