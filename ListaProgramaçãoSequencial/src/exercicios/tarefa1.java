package exercicios;

import java.util.Scanner;

public class tarefa1 {

	public static void main(String[] args)
	{
		 int anos, meses, dias, totalDias;
		
		Scanner kb = new Scanner(System.in); //� preciso adicionar a classe scaner para entrada de dados//in significa q ele d� entrada
		
		//entrada de dados
		System.out.print("Digite os anos: ");
		anos = kb.nextInt();
		System.out.print("Digite os meses: ");
		meses = kb.nextInt();
		System.out.print("Digite os dias: ");
		dias = kb.nextInt();
		
		//processos
		totalDias=anos*365;
		totalDias=totalDias+(meses*30);
		totalDias=totalDias+dias;
		
		System.out.printf("O total de dias �: "+ totalDias);
		
		kb.close();
	}
	
}
