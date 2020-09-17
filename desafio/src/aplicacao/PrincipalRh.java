package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Funcionario;
import entidade.Terceiro;

public class PrincipalRh {

	public static void main(String[] args) {

		int n;
		char opcao;
		String nome;
		int hora;
		double valor;
		double valorextra;

		Scanner kb = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Digite o numero de funcionarios: ");
		n = kb.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Nome do funcionario " + i + " :");
			nome = kb.next();
			System.out.println("Terceiro[S/N]:");
			opcao = kb.next().toUpperCase().charAt(0);
			System.out.println("Nome: ");
			nome = kb.next();
			System.out.println("Horas trabalhadas: ");
			hora = kb.nextInt();
			System.out.println("Valor da hora trabalhada:");
			valor = kb.nextDouble();
			if (opcao == 'S') {
				System.out.println("Digite o valor estra adicional: ");
				valorextra = kb.nextDouble();
				list.add(new Terceiro(nome, hora, valor, valorextra));
			} else {
				list.add(new Funcionario(nome, hora, valor));
			}

		}
		System.out.println();
		System.out.println("PAGAMENTOS");
		for (Funcionario func : list) { // foreach ele ve o tamnha da listae percorre e ciria baseado na lista
			System.out.println(func.getNome() + " " + func.calculaPagamento());
		}

	}

}
