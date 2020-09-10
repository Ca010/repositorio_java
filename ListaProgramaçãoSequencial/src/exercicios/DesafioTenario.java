package exercicios;

import java.util.Scanner;

public class DesafioTenario {
	public static void main(String[] args)
	{
		//feminino 1; masculino 2; outro 3
		//(condicao) ? verdadeiro : falsa
		//? se sim "isso é verdadeiro": se nao "não sei"
		
		
		
		Scanner kb = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número (1,2 ou 3) e irei informar o gênero: ");
		num = kb.nextInt();
		
		System.out.print((num==1)?"Gênero Feminino!":(num==2)?"Gênero Masculino!":(num==3)?"Outro!":"Inválido");
		
	}
}
