package exercicios;

import java.util.Scanner;

public class DesafioTenario {
	public static void main(String[] args)
	{
		//feminino 1; masculino 2; outro 3
		//(condicao) ? verdadeiro : falsa
		//? se sim "isso � verdadeiro": se nao "n�o sei"
		
		
		
		Scanner kb = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um n�mero (1,2 ou 3) e irei informar o g�nero: ");
		num = kb.nextInt();
		
		System.out.print((num==1)?"G�nero Feminino!":(num==2)?"G�nero Masculino!":(num==3)?"Outro!":"Inv�lido");
		
	}
}
