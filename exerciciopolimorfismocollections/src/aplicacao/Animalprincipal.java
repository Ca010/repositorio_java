package aplicacao;

import java.util.Scanner;

import entidade.Cachorro;
import entidade.Cavalo;
import entidade.Preguica;

public class Animalprincipal {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Cachorro cachorro = new Cachorro("Pa�oca", 1, "latido", "corre" );
	Cavalo cavalo = new Cavalo("Campe�o", 2, "Relinchar", "trota.");
	Preguica preguica = new Preguica ("Sid", 5, "shshshshs", "sobe em �rvores.");
	
	cachorro.exibir();
	cavalo.exibir();
	preguica.exibir();
	
	sc.close();
	
		
	}
			
}