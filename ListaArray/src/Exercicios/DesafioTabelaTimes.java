package Exercicios;

import java.util.Scanner;

public class DesafioTabelaTimes {

	public static void main(String[] args) {
		// Fazer dois vetores, um com 4 posi��es e outro com 3 posi��es. No primeiro
		// vetor coloque a
		// lista de times na ordem (Corinthians, Palmeiras, Santos e S�o Paulo). No
		// segundo, a pontua��o (3, 1 ou 0).
		// Ser�o tr�s rodadas. A cada rodada, cada time que ganha, ganha 3 pontos, se
		// empata 1 e se perde nenhum ponto.
		// Mostre a lista de times e pontos em ordem a cada rodada. No final coloque uma
		// op��o para selecionar o time e saber sua posi��o e pontua��o.

		System.out.println("Tabela de pontos");
		System.out.println("GANHOU = 3");
		System.out.println("EMPATOU = 1");
		System.out.println("PERDEU = 0");

		System.out.println();

		System.out.println("Tabela de times (selecione um time)");
		System.out.println("Corinthians (0)");
		System.out.println("Palmeiras (1)");
		System.out.println("Santos (2)");
		System.out.println("SPFC (3)");

		String[] verTime = { "CORINTHIANS", "PALMEIRAS", "SANTOS", "SPFC" };
		int verPontos[] = {3,1,0};
		int x, ponto, i = 0, auxTime = 0;
		Scanner kb = new Scanner(System.in);
		
		for (x = 0; x < 3; x++) {
			System.out.print("Escolha um time: ");
			auxTime = kb.nextInt();
			System.out.print("Digite os pontos: ");
			verPontos[auxTime] = kb.nextInt();
			
			
		}

		kb.close();
	}

}
