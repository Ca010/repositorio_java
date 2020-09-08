package exercicios;

import java.util.Scanner;

public class tarefa2 {

	public static void main(String[] args)
	{
		int dias, anos, meses;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade em dias: ");
		dias = ler.nextInt();
		
		System.out.println("Anos: "+ dias/365);
		System.out.println("Meses: "+ dias/30);
		System.out.println("Dias: "+ dias/1);
	}
}
