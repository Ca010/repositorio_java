package aplicacao;

import entidade.Cachorro;
import entidade.Cavalo;
import entidade.Preguica;

public class Animalprincipal {

	public static void main(String[] args) {

		String nome;
		int idade;
		String emiteSom = null;

		Cachorro dog = new Cachorro("corre");
		Cavalo horse = new Cavalo("cavalga");
		Preguica sloth = new Preguica("escala arvore");

		System.out.println("Som do cachorro: ");
		dog.som();
		System.out.println("O som do cavalo: ");
		horse.som();
		System.out.println("O som da preguiça: ");
		sloth.som();
		System.out.println("\n");
		System.out.println("O cachorro: ");
		dog.correr();
		System.out.println("O cavalo: ");
		horse.correr();
		System.out.println("A preguiça: ");
		sloth.subirArvore();

	}

}