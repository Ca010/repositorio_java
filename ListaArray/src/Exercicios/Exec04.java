package Exercicios;

import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		// 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça
		// ao usuário um menu de opções:
		// (1) somar as duas matrizes
		// (2) subtrair a primeira matriz da segunda
		// (3) adicionar uma constante as duas matrizes
		// (4) imprimir as matrizes
		// Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada.
		// Na terceira opção o valor da constante deve ser lido e o resultado da adição
		// da constante deve ser armazenado na própria matriz.

		final int linha = 2, coluna = 2;
		int[][] matrizUm = new int[linha][coluna];
		int [][] matrizDois = new int[linha][coluna];
		int [][] somaMatriz = new int[linha][coluna];
		int [][] subtrairMatriz = new int[linha][coluna];
		int x = 0, y = 0, opcao = 0, constante = 0, acumuladorConstante = 0;

		Scanner kb = new Scanner(System.in);

		for (x = 0; x < matrizUm.length; x++) {
			for (y = 0; y < matrizUm.length; y++) {
				System.out.print("Digite o valor da primeira matriz: [" + x + "][" + y + "]");
				matrizUm[x][y] = kb.nextInt();
			}
		}
		System.out.println();
		for (x = 0; x < linha; x++) {
			for (y = 0; y < coluna; y++) {
				
				System.out.print("Digite o valor da segunda matriz: [" + x + "][" + y + "]");
				matrizDois[x][y] = kb.nextInt();
			}
		}

		System.out.println("Menus de opções (selecionar o número da opçao desejada)");
		System.out.println("(1)Somar Matrizes");
		System.out.println("(2)Subtrair Matrizes");
		System.out.println("(3)Adicionar uma constante as duas matrizes");
		System.out.println("(4)Imprimir matrizes");

		opcao = kb.nextInt();

		if (opcao == 1) {
			for (x = 0; x < matrizUm.length; x++) {
				for (y = 0; y < matrizDois.length; y++) {
					somaMatriz[x][y] = matrizUm[x][y] + matrizDois[x][y];
					System.out.println(somaMatriz[x][y]);
				}
			}
		}
		if (opcao == 2) {
			for (x = 0; x < matrizUm.length; x++) {
				for (y = 0; y < matrizDois.length; y++) {
					subtrairMatriz[x][y] = matrizUm[x][y] - matrizDois[x][y];
					System.out.println(subtrairMatriz[x][y]);
				}
			}
		}
		if (opcao == 3 && constante == 0) {
			System.out.println("Digite o valor da constante: ");
			constante = kb.nextInt();

			for (x = 0; x < linha; x++) {
				for (y = 0; y < coluna; y++) {

					acumuladorConstante++;

				}
			}
		} else if (opcao == 3 && acumuladorConstante > 0) {

			constante = 0;

			System.out.println("Digite o valor da constante: ");
			constante = kb.nextInt();
		}

		if (opcao == 4) {
			System.out.println("Primeira Matriz");
			for (x = 0; x < matrizUm.length; x++) {
				for (y = 0; y < matrizUm.length; y++) {
					
					System.out.print("" + matrizUm[x][y]);
				}
				System.out.print("| \n");
			}
			System.out.println("\nSegunda Matriz");
			for (x = 0; x < matrizDois.length; x++) {
				for (y = 0; y < matrizDois.length; y++) {
					
					System.out.print("" + matrizDois[x][y]);
				}
				System.out.print("| \n");
			}
		}
	}

}
