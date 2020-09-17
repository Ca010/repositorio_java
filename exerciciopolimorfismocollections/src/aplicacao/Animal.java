package aplicacao;

import entidade.Cachorro;
import entidade.Cavalo;
import entidade.Preguica;

public class Animal {

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
		sloth.som();	}

}
