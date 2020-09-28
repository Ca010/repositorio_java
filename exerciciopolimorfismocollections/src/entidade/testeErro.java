package entidade;

import java.util.Scanner;

public class testeErro {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.println("DIGITE UMA SEQUENCIA DE NOMES");
		String lista[] = leia.nextLine().split(" ");
		System.out.print("Escolha a posição da lista: ");
		int posicao = leia.nextInt();
		System.out.println(lista[posicao]);

		leia.close();

	}

}
