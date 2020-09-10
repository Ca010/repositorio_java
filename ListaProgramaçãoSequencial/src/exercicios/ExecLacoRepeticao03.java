package exercicios;

import java.util.Scanner;

public class ExecLacoRepeticao03 {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
		//Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
		
		Scanner kb = new Scanner(System.in);
		
		int idade = 0, x, pessoasVinte = 0, pessoasCinquenta = 0;
		
		System.out.println("Digite a sua idade: ");
		idade = kb.nextInt();
		
		
	while(idade != -99)
	{
		if(idade>=0 && idade<=21)
		{
			pessoasVinte++;
		}
		if(idade>50)
		{
			pessoasCinquenta++;		
		}	
		System.out.println("Digite a sua idade: ");
		idade = kb.nextInt();
	}
	System.out.println("Total de pessoas com menos de 21 anos:"+ pessoasVinte);
	System.out.println("Total de pessoas com mais de 50 anos:"+ pessoasCinquenta);
	}		
}	

