package Exercicios;

import java.util.Random;

public class Exec03 {
	public static void main(String[] args)
	{
		//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		final int linha = 3, coluna = 3;
		int [][] matriz = new int[linha][coluna];
		int contadorLinha = 0, contadorColuna = 0, x, linhaMatriz, colunaMatriz, valoresMaior;
		
		Random gerador = new Random ();
		for(x=0;x<linha;x++)
		{
			 linhaMatriz = (gerador.nextInt());
			 if(linhaMatriz>=10)
			 {
				 contadorLinha++;
				
			 }
		}
		
		for(x=0;x<coluna;x++)
		{
			 colunaMatriz = (gerador.nextInt());
			 if(colunaMatriz>=10)
			 {
				 contadorColuna++;
				 
			 }
		}
		valoresMaior = contadorLinha+contadorColuna;
		System.out.println("Valores maior que 10: "+ valoresMaior);
	}

}
