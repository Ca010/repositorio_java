package exercicios;

import java.util.Scanner;

public class laçoDeRepeticaoJava4 {

	public static void main(String[] args) {
		//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par 
		//ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
		
		Scanner kb = new Scanner(System.in);
		
		double num, raizQuadrada = 0, elevadoAoQuadrado = 0;
		
		System.out.println("Digite um número: ");
		num = kb.nextInt();
		
		if((num % 2) == 0)
		{
			raizQuadrada = Math.sqrt(num);
			System.out.println("Este é um número par! Sua raiz quadrade é: "+ raizQuadrada);
		}
		else
		{
			elevadoAoQuadrado = Math.pow(num, 2);
			System.out.println("Este é um número ímpar! Seu valor elevado ao quadrado é: "+ elevadoAoQuadrado);
		}
	}

}
