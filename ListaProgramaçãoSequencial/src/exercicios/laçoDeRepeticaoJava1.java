package exercicios;

import java.util.Scanner;

public class laçoDeRepeticaoJava1 {
	public static void main(String[] args)
	{
		
		//1-	Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner kb = new Scanner(System.in);
		
		int num = 0, x, maiorNum = 0;
		
		for(x=1;x<=3;x++)
		{
			System.out.println("Digite um número: ");
			num=kb.nextInt();
		}	
		if(num>maiorNum)
		{
			maiorNum = num++;
		}
		
		System.out.println("O maior número digitado é: "+maiorNum);
	}
}
;