package aplicacao;

import java.util.Scanner;
import entidade.ContaCorrente;
import entidade.ContaPoupanca;

public class Banco {
	public static void main(String[] args) {

		int tipo;

		Scanner kb = new Scanner(System.in);
		ContaCorrente c1 = new ContaCorrente();
		ContaPoupanca p1 = new ContaPoupanca();

		System.out.println("Digite seu tipo de conta: 1-Poupan�a / ...");
		tipo = kb.nextInt();

		if (tipo == 1) {
			System.out.println("Quanto voc� vai colocar na poupan�a por m�s? ");
			p1.setValorMensal(kb.nextInt());

			System.out.println(p1.getValorMensal());
		}

		// c1.emiteTalonario();

	}
}