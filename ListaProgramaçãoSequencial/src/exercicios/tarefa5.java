package exercicios;

import java.util.Scanner;

public class tarefa5 {
	public static void main(String[] args)
	{
		float nota1, nota2, nota3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Inserir nota 1: ");
		nota1 = ler.nextFloat();
		System.out.print("Inserir nota 2: ");
		nota2 = ler.nextFloat();
		System.out.print("Inserir nota 3: ");
		nota3 = ler.nextFloat();
		
		nota1 = nota1*2;
		nota2 = nota2*3;
		nota3 = nota3*5;
		
		media = (nota1+nota2+nota3)/10;
		
		System.out.printf("Media: "+ media);
	}

}
