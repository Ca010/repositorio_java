package exercicio01;

public class Cliente {
	public String nomeCliente;
	public String cpfCliente;
	public String telefoneCliente;
	public char sexoCliente;
	char F;
	
	
	public void cadastroFinalizado() {
		if (sexoCliente == 'F') {
			
			System.out.println("Cadastro finalizado da nossa nova cliente!");
		} else {
			System.out.println("Cadastro finalizado do nosso novo cliente!");
		}
	}
}