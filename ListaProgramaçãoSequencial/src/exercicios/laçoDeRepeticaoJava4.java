package exercicios;

import java.util.Scanner;

public class la�oDeRepeticaoJava4 {

	public static void main(String[] args) {
		//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par 
		//ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.
		
		Scanner kb = new Scanner(System.in);
		
		double num, raizQuadrada = 0, elevadoAoQuadrado = 0;
		
		System.out.println("Digite um n�mero: ");
		num = kb.nextInt();
		
		if((num % 2) == 0)
		{
			raizQuadrada = Math.sqrt(num);
			System.out.println("Este � um n�mero par! Sua raiz quadrade �: "+ raizQuadrada);
		}
		else
		{
			elevadoAoQuadrado = Math.pow(num, 2);
			System.out.println("Este � um n�mero �mpar! Seu valor elevado ao quadrado �: "+ elevadoAoQuadrado);
		}
	}

}
