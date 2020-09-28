package aplicacao;

import java.util.Scanner;

import exercicio01.Cliente;

public class CadastroCliente {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		// estanciar
		Cliente nomeCliente = new Cliente();
		Cliente cpfCliente = new Cliente();
		Cliente foneCliente = new Cliente();
		Cliente sexoCliente = new Cliente();

		System.out.println("Digite o nome do cliente: ");
		nomeCliente.nomeCliente = kb.nextLine();

		System.out.println("Digite o CPF do cliente: ");
		cpfCliente.cpfCliente = kb.nextLine();

		System.out.println("Digite o telefone do cliente: ");
		foneCliente.telefoneCliente = kb.nextLine();

		System.out.println("Selecione F - feminino | M - Masculino: ");
		sexoCliente.sexoCliente = kb.next().toUpperCase().charAt(0);

		sexoCliente.cadastroFinalizado();

		kb.close();

	}

}
